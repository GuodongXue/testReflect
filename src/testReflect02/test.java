package testReflect02;

import java.lang.reflect.Modifier;

public class test {
    public static void main(String[] args) throws ClassNotFoundException {
        //方式一
        Student s = new Student();
        Class c1 = s.getClass();
        Class c2 = s.getClass();
        //System.out.println(c1==c2);

        //方式二
        Class c3 = Student.class;
        Class c4 = Student.class;
        System.out.println(c3==c4);
        System.out.println(c2==c3);

        //方式一和二不常用
        //方式三
        Class c5 = Class.forName("testReflect02.Student");

        //上面已经可以获取Student字节码信息了
        //全称
        System.out.println(c5.getName());
        //简称
        System.out.println(c5.getSimpleName());
        //
        System.out.println(Modifier.toString(c5.getModifiers()));
        System.out.println(c5.getSuperclass().getName());
    }
}
