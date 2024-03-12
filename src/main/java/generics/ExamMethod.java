package generics;

/**
 * @author hsl
 * @version 2.0.0
 * @date 2024/2/23 16:31
 */
public class ExamMethod {

    //declare method
    public <T,K> void test(K k, T t){
        System.out.println(k.getClass().getName());
        System.out.println(t.getClass().getName());

    }

}
