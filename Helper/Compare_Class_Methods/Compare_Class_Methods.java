package Helper.Compare_Class_Methods;



import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Compare_Class_Methods {
    public static void main(String[] args) {

        getCompare(ExecutorService.class, ExecutorService.class);
    }

    public static void getCompare(Class<?>... clazzs) {
        if (clazzs.length == 2) {
            List<Method> methods = getMethods(clazzs[0]);
            List<Method> methods1 = getMethods(clazzs[1]);

            Map<Method, String> firstMethods = new LinkedHashMap<>();
            Map<Method, String> allMethods = new LinkedHashMap<>();

            for (Method method : methods) {
                String str = method.toGenericString();
                String methodName = str.substring(str.lastIndexOf(method.getName()));
                firstMethods.put(method, methodName);
            }

            for (Method method1 : methods1) {
                String str = method1.toGenericString();
                String methodName = str.substring(str.lastIndexOf(method1.getName()));
                allMethods.put(method1, methodName);

            }

            List<Map.Entry<Method, String>> allValues = new LinkedList<>(allMethods.entrySet());

            for (Map.Entry<Method, String> firstEntry : firstMethods.entrySet()) {
                allValues.removeIf(entry -> entry.getValue().equals(firstEntry.getValue()));
            }

            Map<Method, String> differences = new LinkedHashMap<>();
            for (Map.Entry<Method, String> entry : allValues) {

                differences.put(entry.getKey(), entry.getValue());
            }

            AtomicInteger i = new AtomicInteger(1);
            AtomicInteger j = new AtomicInteger(1);

            System.out.printf("\nClass %s has %s methods: ------------------------------------------------------ ", clazzs[0].getSimpleName(), firstMethods.size());
            System.out.println();
            firstMethods.forEach((k, v) -> System.out.println("\n" + i.getAndIncrement() + " " + k.getReturnType() + "   " + v));
            System.out.printf("\nClass %s related to %s has %d new methods:-------------------------------------------------- ", clazzs[1].getSimpleName(),
                    clazzs[0].getSimpleName(), allValues.size());
            System.out.println();
            differences.forEach((k, v) -> System.out.println("\n" + j.getAndIncrement() + " " + k.getReturnType() + "   " + v));

        } else {
            System.out.println("There are not 2 classes/interfaces to compare");
        }
    }

    public static List<Method> getMethods(Class<?> clazz) {
        List<Method> methodNames = new ArrayList<>();

        Method[] methods = clazz.getDeclaredMethods();
        List<Method> sm = Arrays.stream(methods).sorted((s1, s2) -> s1.getName().compareTo(s2.getName())).collect(Collectors.toList());
        for (Method method : sm) {
            methodNames.add(method);
        }
        return methodNames;
    }


}



