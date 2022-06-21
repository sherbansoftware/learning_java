package Reflection.Method.Getter_Testing.Exercise.Solution;

import java.util.*;
import java.lang.reflect.*;


/* In this exercise, we are going to build a simple, general-purpose testing framework.

The input to our framework is a class containing test cases, where each method is an isolated test.

An example of an inputs test class:

/**
 * Represents a test suite for testing the PaymentService
 */

/*
public class PaymentServiceTest {
    private PaymentService service;

    public static void beforeClass() {
        // Called in the beginning of the test suite only once
        // Used for all tests need to share computationally expensive setup
    }

    public void setupTest() {
        // Called before every test
        // Used for setting up resource before every test
    }

    public void testCreditCardPayment() {
        // Test case 1
    }

    public void testWireTransfer() {
        // Test case 2
    }

    public void testInsufficientFunds() {
        // Test case 3
    }

    public static void afterClass() {
        // Called once in the end of the entire test suite
        // Used for closing and cleaning up common resources
    }
}


Input to our framework is a class object

We need to:

If a method called beforeClass() is present, it needs to be called once, at the beginning of the test suite.

If a method with the name setupTest() is present it needs to be called before every test.

Every method that starts with the name test is considered a test case. We need to run each of those tests one after another. A separate object of the test class should be created for each test invocation. The order does not matter.

If a method called afterClass() is present, it needs to be run at the end of the test suite, only once.

Any other methods are considered helper methods and should be ignored.



Note: A proper beforeClass(), afterClass(), setupTest() and test*() method has to be

Public

Take zero parameters

Return void.

If either of those conditions are not met, the method should be ignored.



Assumptions

The test class is guaranteed to have a single declared empty constructor.

*/

public class TestingFramework {
    public void runTestSuite(Class<?> testClass) throws Throwable {
        Method[] methods = testClass.getMethods();

        Method beforeClassMethod = findMethodByName(methods, "beforeClass");

        if (beforeClassMethod != null) {
            beforeClassMethod.invoke(null);
        }

        Method beforeEachTestMethod = findMethodByName(methods, "setupTest");

        List<Method> testMethods = findMethodsByPrefix(methods, "test");

        for (Method test : testMethods) {
            Object testObject = testClass.getDeclaredConstructor().newInstance();

            if (beforeEachTestMethod != null) {
                beforeEachTestMethod.invoke(testObject);
            }

            test.invoke(testObject);
        }

        Method afterClassMethod = findMethodByName(methods, "afterClass");
        if (afterClassMethod != null) {
            afterClassMethod.invoke(null);
        }
    }

    private Method findMethodByName(Method[] methods, String name) {
        for (Method method : methods) {
            if (method.getName().equals(name)
                    && method.getParameterCount() == 0
                    && method.getReturnType() == void.class) {

                return method;
            }
        }
        return null;
    }

    private List<Method> findMethodsByPrefix(Method[] methods, String prefix) {
        List<Method> matchedMethods = new ArrayList<>();

        for (Method method : methods) {
            if (method.getName().startsWith(prefix)
                    && method.getParameterCount() == 0
                    && method.getReturnType() == void.class) {

                matchedMethods.add(method);
            }
        }
        return matchedMethods;
    }
}
