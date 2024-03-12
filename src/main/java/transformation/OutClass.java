package transformation;

/**
 * @author hsl
 * @version 2.0.0
 * @date 2023/11/6 20:39
 */
public class OutClass {

    private int num;

    public static class innerStaticClass {
        protected int age;
    }

    public class innerClass {
        protected int sex;
    }

    public void add(){

    }

    public class ExtendInnerClass extends OutClass{
        @Override
        public void add() {
            super.add();

        }
    }

}
