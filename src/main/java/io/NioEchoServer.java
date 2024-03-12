package io;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;
//
public class NioEchoServer {

    public static void main(String[] args) throws IOException {
        // 打开一个 ServerSocketChannel
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        // 设置为非阻塞模式
        serverSocketChannel.configureBlocking(false);
        // 绑定到端口
        serverSocketChannel.socket().bind(new InetSocketAddress(8080));

        // 打开一个 Selector
        Selector selector = Selector.open();
        // 注册 ServerSocketChannel 到 Selector，关心 OP_ACCEPT 事件
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while (true) {
            // 阻塞等待至少有一个通道准备好 I/O 操作
            int readyChannels = selector.select();
            if (readyChannels == 0) continue;

            // 获取所有已注册的 SelectionKey
            Set<SelectionKey> selectedKeys = selector.selectedKeys();
            Iterator<SelectionKey> keyIterator = selectedKeys.iterator();

            while (keyIterator.hasNext()) {
                SelectionKey key = keyIterator.next();

                if (key.isAcceptable()) {
                    // 接受新的连接
                    SocketChannel client = serverSocketChannel.accept();
                    System.out.println("Accepted new connection from " + client);
                    // 配置为非阻塞模式
                    client.configureBlocking(false);
                    // 注册到 Selector，关心 OP_READ 事件
                    client.register(selector, SelectionKey.OP_READ);
                }

                if (key.isReadable()) {
                    // 读取数据
                    SocketChannel client = (SocketChannel) key.channel();
                    ByteBuffer buffer = ByteBuffer.allocate(1024);
                    int bytesRead = client.read(buffer);
                    if (bytesRead == -1) {
                        // 关闭连接
                        client.close();
                    } else {
                        // 切换 buffer 为读模式
                        buffer.flip();
                        // 写入数据回客户端
                        while (buffer.hasRemaining()) {
                            client.write(buffer);
                        }
                        // 清空 buffer
                        buffer.clear();
                    }
                }

                if (key.isWritable()) {
                    // 在这个例子中，我们不处理写操作
                }

                // 移除已处理的 SelectionKey
                keyIterator.remove();
            }
        }
    }
}