/**
 * @author hsl
 * @version 2.0.0
 * @date 2023/7/6 15:25
 */
public class Genericity<T> {

    public static void main(String[] args) {
        byte a = 127;
        byte b = 127;
        int c = a + b;
//        a = (byte) (a + b);
        a +=b;
        System.out.println("a is:" + a + "c is :" + c);

    }

}
