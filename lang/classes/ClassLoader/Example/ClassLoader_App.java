package lang.classes.ClassLoader.Example;

import java.lang.reflect.Method;

public class ClassLoader_App {
    public static void main(String[] args) {
        CustomClassLoader customClassLoader = new CustomClassLoader();
        try {
            Object obj;
            obj = customClassLoader.findClass("lang.classes.ClassLoader.Example.Info").newInstance();
            Method[] methods = obj.getClass().getDeclaredMethods();
            System.out.println(String.format("Methods of %s class:", obj.getClass().getName()));
            for (Method method : methods) {
                System.out.println(method.getName());
            }
        } catch (ClassFormatError e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
