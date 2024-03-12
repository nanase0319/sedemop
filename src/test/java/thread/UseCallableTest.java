package thread;

import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author hsl
 * @version 2.0.0
 * @date 2023/12/22 17:11
 */
public class UseCallableTest {

    @Test
    public void call() throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask = new FutureTask<String>(new UseCallable());
        Thread thread = new Thread(futureTask);
        thread.start();
        String s = futureTask.get();
//        get the async result
        System.out.println(s);
        synchronized (UseCallable.class){

        }
    }
}