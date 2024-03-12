package reflection;

import reflection.anno.TestClass;
import reflection.anno.TestMethod;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 反射
 * @author hsl
 * @version 2.0.0
 * @date 2024/2/25 16:20
 */
@TestClass(value = "1", name = "2")
public class Reflection {
    public String name;
    
    @TestMethod(name = "test",value = "test2")
    public void test(){
        System.out.println("....");
    } 
    
    public static void main(String[] args)  {
        //class

        try
        {
            Class<?> aClass = Class.forName("reflection.Reflection");

            Constructor<?> constructor = aClass.getConstructor();
            //constructor
            Object o = constructor.newInstance();
            //class
            aClass.newInstance();

            //get annotation
            // 获取带注解的类

            // 获取类注解
            if (aClass.isAnnotationPresent(TestClass.class)) {
                TestClass classAnnotation = aClass.getAnnotation(TestClass.class);
                System.out.println("Class Annotation: " + classAnnotation.value());
            }

            // 获取类的方法
//            Method[] methods = aClass.getDeclaredMethods();
//            for (Method method : methods) {
//                // 获取方法注解
//                if (method.isAnnotationPresent(TestMethod.class)) {
//                    TestMethod methodAnnotation = method.getAnnotation(TestMethod.class);
//                    System.out.println("Method Annotation: " + methodAnnotation.value());
//                }
//
//                // 获取方法上的所有注解
//                Annotation[] annotations = method.getAnnotations();
//                for (Annotation annotation : annotations) {
//                    System.out.println("Method Annotation: " + annotation.toString());
//                }
//            }

            //获取指定方法
            Method test = aClass.getMethod("test");
            // 获取方法注解
            if (test.isAnnotationPresent(TestMethod.class)) {
                TestMethod methodAnnotation = test.getAnnotation(TestMethod.class);
                System.out.println("Method Annotation: " + methodAnnotation.value());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
