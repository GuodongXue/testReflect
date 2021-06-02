package testReflect02;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class c = Class.forName("testReflect02.Student");

//        获取方法
//        获取子类和所有父类的public修饰方法

        /*Method[] methods = c.getMethods();

        for(Method m: methods){
            System.out.println(m);
            System.out.println(methods.length);
        }*/
        Method[] declaredMethods = c.getDeclaredMethods();

        for(Method m: declaredMethods){
            System.out.println(m);
        }
//        获取指定的方法
        Method method = c.getMethod("toString");
        System.out.println(method);
//        有重载的就要传进去一个字符串， 一个数字
        Method method1 = c.getMethod("setSex", String.class);
        System.out.println(method1);
        Method method2 = c.getMethod("b", int.class, double.class, String.class);
        System.out.println(method2);
        System.out.println("方法的名字："+ method2.getName());
        System.out.println("方法的修饰符"+ Modifier.toString(method2.getModifiers()));
        System.out.println("方法的返回值"+method2.getReturnType());
        System.out.println("参数列表"+ Arrays.toString(method2.getParameterTypes()));

        //调用方法 invoke方法有两个参数，第一个指定对象， 第二个为可变参数，调用方法传入的具体数值
        Object o1 = c.newInstance();
        method2.invoke(o1,1,18.9, "aaaa");

    }
}
