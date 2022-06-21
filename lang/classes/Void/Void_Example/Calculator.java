package lang.classes.Void.Void_Example;

// https://www.baeldung.com/java-void-type

public class Calculator {
    private int result = 0;

    public int add(int number) {
        return result += number;
    }

    public int sub(int number) {
        return result -= number;
    }

    public void clear() {
        result = 0;
    }

    public void print() {
        System.out.println(result);
    }
//    @Test
//    void givenCalculator_whenGettingVoidMethodsByReflection_thenOnlyClearAndPrint() {
//        Method[] calculatorMethods = Calculator.class.getDeclaredMethods();
//        List<Method> calculatorVoidMethods = Arrays.stream(calculatorMethods)
//                .filter(method -> method.getReturnType().equals(Void.TYPE))
//                .collect(Collectors.toList());
//
//        assertThat(calculatorVoidMethods).
//                .allMatch(method -> Arrays.asList("clear", "print").contains(method.getName()));
//    }
}
