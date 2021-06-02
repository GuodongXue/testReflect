package testReflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //反射
        //字符串从前台传过来,要用什么就传回来什么
        String str = "testReflect.AliPay";
        //Class.forName("testReflect.WeChat").newInstance();

//        利用反射完成在线支付
        Class c = Class.forName(str);
        Object o = c.newInstance();
        Method method = c.getMethod("payOnline");
        method.invoke(o);
    }
}
