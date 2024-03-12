package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface MyInterface {
    void doSomething();
}

class MyInterfaceImpl implements MyInterface {
    private String member;

    @Override
    public void doSomething() {
        System.out.println("Original method called"+ member);
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }
}

class MyInvocationHandler implements InvocationHandler {
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before method call");
        Object result = method.invoke(target, args);
        System.out.println("After method call");
        return result;
    }
}

class ProxyFactory{
    //using factory
    public static Object getJdkProxy(Object target, InvocationHandler handler){
       return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
//                new Class<?>[]{target.getClass()},
               target.getClass().getInterfaces(),
                handler
        );
    }
}




public class DynamicProxyExample {
    public static void main(String[] args) {
        MyInterfaceImpl originalObject = new MyInterfaceImpl();
        originalObject.setMember("你好");
//        MyInvocationHandler handler = new MyInvocationHandler(originalObject);

//        MyInterface proxyObject = (MyInterface) Proxy.newProxyInstance(
//            MyInterface.class.getClassLoader(),
//            new Class<?>[]{MyInterface.class},
//            handler
//        );
        MyInterface proxyObject = (MyInterface)ProxyFactory.getJdkProxy(originalObject, new MyInvocationHandler(originalObject));
        proxyObject.doSomething();
    }
}