package Java8.Lambda_Expressions.UnaryOperator;

import java.util.function.LongUnaryOperator;

public class UnaryOperator_Example {
    public static void main(String[] args) {

        LongUnaryOperator inBy5 = new LongUnaryOperator () {
            @Override
            public long applyAsLong(long operand) {
                return operand;
            }
       };
        System.out.println (inBy5.applyAsLong (11));

    }
}