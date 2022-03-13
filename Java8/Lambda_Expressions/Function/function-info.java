package Java8.Lambda_Expressions.Function;

/*                                                   @FunctionalInterface
                                                     public interface Function<T,R>

    This is a functional interface and can therefore be used as the assignment target for a

         lambda expression
          method reference.

     This is a functional interface whose functional method is apply(lang.classes.Object).

    Type Parameters:

        T - the type of the input to the function
        R - the type of the result of the function

                                                     All methods

      Modifier and Type	                                       Method and Description

    default <V> Function<T,V>	                      andThen(Function<? super R,? extends V> after)

                                                          Returns a composed function that first applies this function
                                                          to its input, and then applies the after function to the result.

    R	                                              apply(T t)

                                                          Applies this function to the given argument.

    default <V> Function<V,R>	                      compose(Function<? super V,? extends T> before)

                                                          Returns a composed function that first applies the before
                                                          function to its input, and then applies this function to the result.

    static <T> Function<T,T>	                      identity()

                                                          Returns a function that always returns its input argument.

*/