package staticproxy;

/**
 * @author hsl
 * @version 2.0.0
 * @date 2023/9/24 15:36
 */
public class ProxyClass implements CommonInterface{
    private TargetClass targetClass;
    //get targetClass
    //by constructor
    public ProxyClass(TargetClass targetClass){
        this.targetClass = targetClass;
    }
    //by method
    public void proxy(TargetClass targetClass){
        this.targetClass = targetClass;
    }
    @Override
    public void tMethod(int arg) {
        //before target
        System.out.println("before target");
        //base in targetClass
        targetClass.tMethod(arg);
        //after target
        System.out.println("after target");
    }
}
