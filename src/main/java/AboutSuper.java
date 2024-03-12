/**
 * keywords super
 * @author hsl
 * @version 2.0.0
 * @date 2023/9/23 15:15
 */
public class AboutSuper {
    //father class
    public class Fruit{
        int num;
        String color;
        public void eat(){
            System.out.println("eat Fruit");
        }
    }

    //son class
    public class Apple extends Fruit{

        //override eat method;
        @Override
        public void eat() {
            //using father eat method;
//            super.eat();
            //using father num attribute;
            super.num = 10;
            System.out.println("i eat" + num + "Apple");
        }
    }

}
