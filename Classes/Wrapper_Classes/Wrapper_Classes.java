package Classes.Wrapper_Classes;

//https://www.w3schools.com/java/java_wrapper_classes.asp



/*                                               Wrapper classes


    ○ A primitive wrapper class in the Java programming language is

                  * one of eight classes provided in the java.lang package

          to provide object methods for the eight primitive types.

    ○ All the primitive wrapper classes in Java are immutable.

                   * Wrapper:   Boolean,Byte,Character,Double,Float,Integer,Long,Short

                   * Primitive: boolean,byte,char ,double, float, int , long,short


                                    Why	do	we	need Wrapper Classes in	Java?


    ○ Wrapper classes have a lot of utility methods

    ○ A wrapper class wraps (encloses) around a data type and gives it an object appearance.

       Reasons why we need Wrapper Classes

                   * null is a possible value

                   * use it in a Collection

                   * Methods that support Object like creation from other types.. like String

                                  - Integer	number2 =	new Integer("55");//String


                              2 ways of creating Wrapper Class Instances?


    1. Using a Wrapper Class Constructor    -- deprecated

                   * Integer number =	new Integer(55);//int

                   * Integer number2 =	new Integer("55");//String

                   *  Float	number3 = new Float(55.0);//double	argument

                   * Float	number4 =	new Float(55.0f);//float	argument

                  *   Float	number5 =	new Float("55.0f");//String

                  * Character	c1 =	new Character('C');//Only	char	constructor

                 //Character	c2	=	new	Character(124);//COMPILER	ERROR

                   * Boolean	b =	new Boolean(true);

                   * //"true"	"True"	"tRUe"	- all	String	Values	give	True

                     //Anything	else	gives	false
                   *  Boolean	b1 =	new Boolean("true");//value	stored	- true

                   * Boolean	b2 =	new Boolean("True"); //value	stored	- true

                    * Boolean	b3 =	new Boolean("False");//  value	stored	- false

                    *  Boolean	b4 =	new Boolean("SomeString");//value	stored	- false


    2. valueOf Static Methods

        Integer	hundred = Integer.valueOf("100");//100	is	stored	in	variable
        Integer	seven	=	Integer.valueOf("111",	2);//binary	111	is	converted	to	7


                       What	are	differences	in the two ways	of	creating Wrapper	Classes?


    ○ The difference is	that:

                   * using the Constructor you	will always	create	a new object,

                   * while	using valueOf() static	method,	it may	return	you

                             a cached value	with-in	a range.

    ○ For example	:

                   * The	cached	values	for long are

                   	              - between [-128	to	127].

    ○ We should prefer	static	valueOf	method,	because	it	may	save

    	            * you some	memory.

    	 To	understand	it	further, here	is	an	implementation of valueOf method in	the	Long class


 public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
    }


 */

public class Wrapper_Classes {
    public static void main(String[] args) {


        //using valueOf
        // String "100"	is	stored	in	variable
        Integer	hundred = Integer.valueOf("100");

        //binary	111	is	converted	to	7
        Integer	seven	=	Integer.valueOf("111",	2);

        Boolean	b1 =	Boolean.valueOf("true");//value	stored	- true

    }


}
