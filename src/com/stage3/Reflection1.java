package com.stage3;
import com.stage2.oop4polymorphism;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection1 {
    /*
    * A.
    * 反射是指对于任何一个Class类，在"运行的时候"都可以直接得到这个类全部成分。
    在运行时,可以直接得到这个类的构造器对象：Constructor
    在运行时,可以直接得到这个类的成员变量对象：Field
    在运行时,可以直接得到这个类的成员方法对象：Method
    这种运行时动态获取类信息以及动态调用类中成分的能力称为Java语言的反射机制。
    a. get Reflection object
    * 反射的核心思想和关键就是:得到编译以后的class文件对象。
    * a.1 get Class object
    * */
    public void testGetClassObj() throws ClassNotFoundException {
        // 1、Class类中的一个静态方法：forName(全限名：包名 + 类名)
        Class c = Class.forName("com.stage3.Set2");
        System.out.println(c); // Student.class

        // 2、类名.class
        Class c1 = Student.class;
        System.out.println(c1);

        // 3、对象.getClass() 获取对象对应类的Class对象。
        Set2 s = new Set2();
        Class c2 = s.getClass();
    }
    /*
    * b get constructor object
    * b.1 method to get constructor object
        Constructor<?>[] getConstructors ()         返回所有构造器对象的数组（只能拿public的）
        Constructor<?>[] getDeclaredConstructors () 返回所有构造器对象的数组，存在就能拿到
        Constructor<T> getConstructor (Class<?>... parameterTypes)          返回单个构造器对象（只能拿public的）
        Constructor<T> getDeclaredConstructor (Class<?>... parameterTypes)  返回单个构造器对象，存在就能拿到
    b.2 new object
        T newInstance (Object... initargs)          根据指定的构造器创建对象
        public void  setAccessible(boolean flag)    设置为true,表示取消访问检查，进行暴力反射

    * */
    public void testConstructor() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 1、Class类中的一个静态方法：forName(全限名：包名 + 类名)
        Class c = Class.forName("com.stage2.oop4polymorphism");
//        定位某个有参构造器
        Constructor cons=c.getDeclaredConstructor();
        // 如果遇到了私有的构造器，可以暴力反射
        cons.setAccessible(true); // 权限被打开
        oop4polymorphism oop4=(oop4polymorphism) cons.newInstance();
    }

    /*
    * c. get Method object
    c.1 method to get Method object
    * Method[] getMethods ()              返回所有成员方法对象的数组（只能拿public的）
    Method[] getDeclaredMethods  ()     返回所有成员方法对象的数组，存在就能拿到
    Method getMethod  (String name, Class<?>... parameterTypes)         返回单个成员方法对象（只能拿public的）
    Method getDeclaredMethod  (String name, Class<?>... parameterTypes) 返回单个成员方法对象，存在就能拿到
    * c.2 execute method
        Object invoke(Object obj, Object... args) 参数一：用obj对象调用该方法   参数二：调用方法的传递的参数（如果没有就不写）
                        返回值：方法的返回值（如果没有就不写）
    * */
    public void testMethodobj() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 1、Class类中的一个静态方法：forName(全限名：包名 + 类名)
        Class c = Class.forName("com.stage2.oop4polymorphism");
//        定位某个有参构造器
        Constructor cons=c.getDeclaredConstructor();
        // 如果遇到了私有的构造器，可以暴力反射
        cons.setAccessible(true); // 权限被打开
        oop4polymorphism oop4=(oop4polymorphism) cons.newInstance();
//        提取单个方法对象
        Method meth1=c.getDeclaredMethod("testVariableAndPoly");
//        触发方法的执行
        meth1.invoke(oop4);
    }

    /*
    * B. application
    * 反射的作用-绕过编译阶段为集合添加数据
    * a.theory
    * 泛型只是在编译阶段可以约束集合只能操作某种数据类型，在编译成Class文件进入运行阶段的时候，其真实类型都是ArrayList了，泛型相当于被擦除了。
    * 编译成Class文件进入运行阶段的时候，泛型会自动擦除。
     * */

    public static void main(String[]args){
        Reflection1 testR=new Reflection1();

        try {
            testR.testMethodobj();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
