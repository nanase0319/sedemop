package exception;

/**
 * @author hsl
 * @version 2.0.0
 * @date 2023/9/24 17:14
 */
public class AboutException {

    public void getSome() throws Exception {
       //throw Exception
       throw new Exception();
    }

    public void useGetSome() throws Exception{
        try {
            getSome();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testThrows(){
        //result : using throws must be tell user this method has exception which need to deal
        //although this method had catch exception
        try {
            useGetSome();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
