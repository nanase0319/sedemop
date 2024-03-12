package reference;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author hsl
 * @version 2.0.0
 * @date 2023/10/30 17:45
 */
public class ReferenceInfo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //new reference
        Class<?> aClass = Class.forName("reference.ReferenceInfo");
        Constructor<?> constructor = aClass.getConstructor();
        Object o = constructor.newInstance(); 
    }

    public class Test{
        private Integer num;
    }
}
