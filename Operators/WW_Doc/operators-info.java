package Operators.WW_Doc;

/*
    Operators	           Precedence


    postfix	                expr++ expr--

    unary	                ++expr --expr +expr -expr ~ !

    multiplicative	        * / %

    additive	           + -

    shift	               << >> >>>

    relational	          < > <= >= instanceof

    equality	              == !=

    bitwise AND	               &

    bitwise exclusive OR	    ^

    bitwise inclusive OR	    |

    logical AND              	&&

    logical OR  	             ||

    ternary	                     ? :

    assignment	                 = += -= *= /= %= &= ^= |= <<= >>= >>>=

    method reference operator    ::     (double colon)

    The double colon (::) operator, also known as method reference operator in Java, is used to call a method by
    referring to it with the help of its class directly. They behave exactly as the lambda expressions. The only
    difference it has from lambda expressions is that this uses direct reference to the method by name instead of
    providing a delegate to the method.

    stream.forEach( System.out::println(s));

*/