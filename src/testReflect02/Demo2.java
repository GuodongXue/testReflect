package testReflect02;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Demo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class c = Class.forName("testReflect02.Student");

        //获取属性, 能获取被public修饰的属性
        Field[] fs = c.getFields();
        for(Field f:fs){

            System.out.println(f);
        }
        Field[] fs2 = c.getDeclaredFields();
        for(Field f: fs2){
            System.out.println(f);
        }

        Field[] fs3 = c.getSuperclass().getDeclaredFields();
        for(Field f: fs3){
            System.out.println(f);
        }
        Field sid = c.getField("sid");
        System.out.println(sid+"------------------");

//        Field sex = c.getField("sex");
        Field sex = c.getDeclaredField("sex");
        System.out.println(sex);
        Object o1 = c.getConstructor().newInstance();
        sid.set(o1,1001);
        System.out.println(o1);
        //给sex赋值
        sex.setAccessible(true);
        sex.set(o1, "男");
        System.out.println(o1);
    }
}
