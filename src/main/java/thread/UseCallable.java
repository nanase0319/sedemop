package thread;

import java.util.concurrent.Callable;

/**
 * using西
 * @author hsl
 * @version 2.0.0
 * @date 2023/12/12 21:36
 */
public class UseCallable implements Callable {

    @Override
    public String call() throws Exception {
        return "good";

    }
}
