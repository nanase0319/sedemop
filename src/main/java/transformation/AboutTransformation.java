package transformation;

/**
 * @author hsl
 * @version 2.0.0
 * @date 2023/9/26 23:06
 */
public class AboutTransformation {

    //as variable
    public void asVariable(){
        FatherClass fatherClass = new SonClass();
    }

    //as parameter
    public void asParameter(FatherClass fatherClass){
        
    }

    public static void main(String[] args) {
        AboutTransformation aboutTransformation = new AboutTransformation();
        aboutTransformation.asParameter(new SonClass());

    }
}
