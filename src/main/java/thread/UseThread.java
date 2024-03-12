package thread;

/**
 * @author hsl
 * @version 2.0.0
 * @date 2023/12/12 21:36
 */
public class UseThread extends Thread{

    @Override
    public void run() {
        System.out.println("继承thread类重写run方法");
    }
}
