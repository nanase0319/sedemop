/**
 * @author hsl
 * @version 2.0.0
 * @date 2023/9/23 14:00
 */
public class AboutThis {
    private int num;

    private String color;

    //no arg
    public AboutThis(){
        //default value for num is 0;
    }
    public AboutThis(int num){
        //make it in attribute
        this.num = num;
    }

    //make it in method;
    public AboutThis addNum(){
        num++;
        return this;
        //i guess it make for call chaining;
    }

    //make it in constructor
    public AboutThis(String color){
        //using another constructor to init reference;
//        this.num =2;
        this(2,color);

    }


    public AboutThis(int num, String color){
        this.num = num;
        this.color = color;
    }
    public static void main(String[] args) {
        AboutThis aboutThis = new AboutThis();
        aboutThis.addNum().addNum();
    }

}
