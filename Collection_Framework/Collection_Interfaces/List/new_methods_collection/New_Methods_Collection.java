package Collection_Framework.Collection_Interfaces.List.new_methods_collection;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

public class New_Methods_Collection {
    public static void main(String[] args) {

        Class<?>[] cls = {Collection.class, List.class};
        getCompare(cls);
    }


    public static void getCompare(Class<?>[] clazzs) {
        if (clazzs.length == 2) {
            List<Method> methods = getMethodsName(clazzs[0]);
            List<String> methodsName = methods.stream().map(m -> m.getName()).collect(Collectors.toList());
            List<Method> methods1 = getMethodsName(clazzs[1]);
            List<String> methods1Name = methods1.stream().map(m -> m.getName()).collect(Collectors.toList());

            int difference = methods1.size() - methods.size();

            System.out.printf("\nClass/Interface %s has: %d methods", clazzs[0].getSimpleName(), methods.size());
            System.out.printf("\nClass/Interface %s has: %d methods ", clazzs[1].getSimpleName(), methods1.size());
            System.out.printf("\nClass/Interface %s has %d additional methods:\n ", clazzs[1].getSimpleName(), difference);

            methods1Name.removeAll(methodsName);

            System.out.println(methods1Name.size());
            methods1Name.forEach(m -> System.out.println(m));


        } else {
            System.out.println("There are not 2 classes/interfaces to compare");
        }
    }

    @NotNull
    public static List<Method> getMethodsName(Class<?> clazz) {
        List<Method> methodNames = new ArrayList<>();

        Method[] methods = clazz.getDeclaredMethods();
        List<Method> sm = Arrays.stream(methods).sorted((s1, s2) -> s1.getName().compareTo(s2.getName())).collect(Collectors.toList());

        for (var method : sm) {
            methodNames.add(method);
        }
        return methodNames;
    }

}
