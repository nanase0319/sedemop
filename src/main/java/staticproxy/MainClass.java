package staticproxy;

/**
 * @author hsl
 * @version 2.0.0
 * @date 2023/9/24 15:35
 */
public class MainClass {
    public static void main(String[] args) {
        TargetClass targetClass = new TargetClass();
        ProxyClass proxyClass = new ProxyClass(targetClass);
        proxyClass.tMethod(3);
    }
}
