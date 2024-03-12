package io;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
//在这个例子中，客户端首先创建一个SocketChannel并连接到服务器。在连接过程中，客户端设置SocketChannel
// 为非阻塞模式。然后，它发送一个字符串消息到服务器，并等待服务器的响应。当服务器响应时，客户端读取数据并打印
// 出来。最后，客户端关闭通道以释放资源。
//
//请注意，这个客户端例子是在非阻塞模式下运行的，这意味着SocketChannel.connect()、SocketChannel.write()和SocketChannel.read()方法可能不会立即完成。
// 因此，客户端需要适当地处理这些情况，例如通过轮询或使用选择器（Selector）来等待I/O操作的完成。在这个简单的例子中，我们使用了
// finishConnect()方法来等待连接完成，并在发送和接收数据时使用了循环来检查是否有数据可读或可写。在实际应用中，您可能会使用Selector来更有效地管理多个通道和I/O操作。
public class NioClient {

    public static void main(String[] args) throws IOException {
        // 打开一个SocketChannel并连接到服务器
        SocketChannel clientChannel = SocketChannel.open();
        clientChannel.configureBlocking(false); // 设置为非阻塞模式
        clientChannel.connect(new InetSocketAddress("localhost", 8080));

        // 等待连接完成
        while (!clientChannel.finishConnect()) {
            // 在连接完成之前，可以做其他事情
        }

        // 发送数据到服务器
        String message = "Hello, server!";
        ByteBuffer writeBuffer = ByteBuffer.wrap(message.getBytes());
        clientChannel.write(writeBuffer);

        // 等待并读取服务器的响应
        ByteBuffer readBuffer = ByteBuffer.allocate(1024);
        while (clientChannel.read(readBuffer) == 0) {
            // 如果没有数据可读，可以稍后再试
        }

        // 切换缓冲区为读模式并处理响应
        readBuffer.flip();
        byte[] bytes = new byte[readBuffer.remaining()];
        readBuffer.get(bytes);
        String response = new String(bytes, "UTF-8");
        System.out.println("Received from server: " + response);

        // 关闭通道
        clientChannel.close();
    }
}