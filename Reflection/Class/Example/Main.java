package Reflection.Class.Example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Class Demonstration
 * https://www.udemy.com/course/java-reflection-master-class/learn/lecture/18832708#overview
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException {

        Class<String> stringClass = String.class;

        Map<String, Integer> mapObject = new HashMap<>();

        Class<?> hashMapClass = mapObject.getClass();

        Class<?> squareClass = Class.forName("Reflection.Class.Example.Main$Square");

        printClassInfo(stringClass, hashMapClass, squareClass);

        var circleObject = new Drawable() {
            @Override
            public int getNumberOfCorners() {
                return 4;
            }
        };


        printClassInfo(Collection.class, boolean.class, int[][].class, Color.class, circleObject.getClass(), Object.class);
    }

    private static void printClassInfo(Class<?>... classes) {

        for (var clazz : classes) {

            System.out.println(String.format("class name : %s, class package name : %s , class module : %s",
                    clazz.getSimpleName(),
                    clazz.getPackageName(),
                    clazz.getModule().toString()));

            Class<?>[] implementedInterfaces = clazz.getInterfaces();

            for (Class<?> implementedInterface : implementedInterfaces) {
                System.out.println(String.format("class %s implements : %s",
                        clazz.getSimpleName(),
                        implementedInterface.getSimpleName()));
            }

            System.out.println("Is array : " + clazz.isArray());
            System.out.println("Is primitive : " + clazz.isPrimitive());
            System.out.println("Is enum : " + clazz.isEnum());
            System.out.println("Is interface : " + clazz.isInterface());
            System.out.println("Is anonymous :" + clazz.isAnonymousClass());

            System.out.println();
            System.out.println();
        }
    }

    private enum Color {
        BLUE,
        RED,
        GREEN
    }

    @FunctionalInterface
    private static interface Drawable {
        int getNumberOfCorners();
    }

    static class Square implements Drawable {

        @Override
        public int getNumberOfCorners() {
            return 4;
        }
    }

}
