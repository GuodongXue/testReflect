package testReflect02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo01 {
     //获取Student的字节码信息
     public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
         Class c = Class.forName("testReflect02.Student");
        //获取内部构造器
         Constructor[] constructors = c.getConstructors();
         //这里不能输出private构造器

         for(Constructor con: constructors){
             System.out.println(con);
         }
         Constructor[] con2 = c.getDeclaredConstructors();
         for(Constructor con: con2){
             System.out.println(con2);
         }
         //获取指定构造器
         //获取空构造器
         Constructor con1 = c.getConstructor();
         System.out.println(con1);
         //获取六个参数的构造器
         Constructor con4 = c.getConstructor(int.class, String.class, String.class, double.class, double.class, int.class);
         System.out.println(con4);

         Constructor con5 = c.getDeclaredConstructor(int.class, String.class, String.class, double.class);
         System.out.println(con5);
         con5.setAccessible(true);
         Object o1= con1.newInstance();
         System.out.println(o1);
         Object o2 = con4.newInstance(18, "lili", "male",98.3, 150.7, 1001);
         System.out.println(o2);

         Object o3 = con5.newInstance(18, "lili", "male",98.3);

         System.out.println(o3);
     }

}
