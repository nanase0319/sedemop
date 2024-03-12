package transformation;

/**
 * @author hsl
 * @version 2.0.0
 * @date 2023/11/6 20:41
 */
public class UsingInnerClass {
    public static void main(String[] args) {
        OutClass.innerStaticClass innerStaticClass = new OutClass.innerStaticClass();
        int age = innerStaticClass.age;

        OutClass outClass = new OutClass();
        OutClass.innerClass innerClass1 = outClass.new innerClass();
        Thread thread = new Thread() {
            @Override
            public void run() {
                super.run();
            }
        };

        OutClass outClass1 = new OutClass() {
            public void add() {
                super.add();
            }
        };


    }
}
