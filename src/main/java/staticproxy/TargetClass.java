package staticproxy;

/**
 * @author hsl
 * @version 2.0.0
 * @date 2023/9/24 15:36
 */
public class TargetClass implements CommonInterface{


    @Override
    public void tMethod(int arg) {
        System.out.println("output-arg:" + arg);
    }
}

