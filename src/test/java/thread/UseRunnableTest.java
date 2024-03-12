package thread;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author hsl
 * @version 2.0.0
 * @date 2023/12/13 22:36
 */
public class UseRunnableTest {

    @Test
    public void run() throws InterruptedException {
        Thread thread = new Thread(new UseRunnable());

        thread.start();
        thread.join();
        System.out.println("wait for thread");
    }
}