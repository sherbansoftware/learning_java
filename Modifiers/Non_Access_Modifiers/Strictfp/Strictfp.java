package Modifiers.Non_Access_Modifiers.Strictfp;

/*                                   strictfp keyword

    is a non access modifier that stands for strict floating-point which was not introduced in the base version of java
        as it was introduced in Java version 1.2. It is used in java for restricting floating-point calculations and ensuring
        the same result on every platform while performing operations in the floating-point variable.
    Floating-point calculations are platform-dependent i.e. different output(floating-point values) is achieved when a
        class file is run on different platforms(16/32/64 bit processors). To solve this type of issue, strictfp keyword
        was introduced in JDK 1.2 version by following IEEE 754 standards for floating-point calculations.

                                      where can be used

    We can use the strictfp keyword as a non-access modifier for

        classes,
        non-abstract methods
        interfaces

                                       CANNOT BE USED ON

        variables,
        constructors
        or abstract methods.

                                        when to use

    Java strictfp keyword comes handy whenever we care a great deal about the deterministic behavior of all floating-point
        computations:
    Since the ScientificCalculator class makes use of this keyword, the above test case will pass on all hardware platforms.
    Please note that if we don't use it, JVM is free to use any extra precision available on the target platform hardware.
    A popular real-world use-case for it is a system performing highly-sensitive medicinal calculations.

 */


import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


//public strictfp class Strictfp {
//
//    // All concrete methods here are implicitly strictfp.
//}


  strictfp class ScientificCalculator {


    public double sum(double value1, double value2) {
        return value1 + value2;
    }

    public double diff(double value1, double value2) {
        return value1 - value2;
    }


    public strictfp void calculateMarksPercentage() {

    }

public strictfp interface Circle {
    double computeArea(double radius);
}

    @Test
    public void whenMethodOfstrictfpClassInvoked_thenIdenticalResultOnAllPlatforms() {
        ScientificCalculator calculator = new ScientificCalculator();
        double result = calculator.sum(23e10, 98e17);
        assertThat(result, is(9.800000230000001E18));

        result = calculator.diff(Double.MAX_VALUE, 1.56);
        assertThat(result, is(1.7976931348623157E308));
    }

}
