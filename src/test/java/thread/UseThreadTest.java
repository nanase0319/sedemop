package thread;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author hsl
 * @version 2.0.0
 * @date 2023/12/13 15:07
 */
public class UseThreadTest {

    @Test
    public void run() throws Exception {
        UseThread useThread = new UseThread();
        //开启线程

        useThread.start();
        //主线程等待子线程执行完成
//        useThread.join();
        System.out.println("主线程停止三秒等待子线程执行完成");
        Thread.sleep(3000);
    }

    @Test
    public void testAICode() throws Exception{
            Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello from child thread!");
                try {
                    // 模拟耗时操作
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();

        // 主线程等待子线程结束
        thread.join();

        System.out.println("Child thread finished.");
    }
}