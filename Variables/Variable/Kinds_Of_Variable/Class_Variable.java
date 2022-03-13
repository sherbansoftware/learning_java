package Variables.Variable.Kinds_Of_Variable;

public class Class_Variable {

	/*
	 * There are eight kinds of variables:

    1. A class variable is a field declared using the keyword static within a class
declaration (�8.3.1.1), or with or without the keyword static within an
interface declaration (�9.3).
A class variable is created when its class or interface is prepared (�12.3.2) and
is initialized to a default value (�4.12.5). The class variable effectively ceases
to exist when its class or interface is unloaded (�12.7).
2. An instance variable is a field declared within a class declaration without using
the keyword static (�8.3.1.1).
If a class T has a field a that is an instance variable, then a new instance variable
a is created and initialized to a default value (�4.12.5) as part of each newly
created object of class T or of any class that is a subclass of T (�8.1.4). The
4.12 Variables TYPES, VALUES, AND VARIABLES
84
instance variable effectively ceases to exist when the object of which it is a field
is no longer referenced, after any necessary finalization of the object (�12.6)
has been completed.
3. Array components are unnamed variables that are created and initialized to
default values (�4.12.5) whenever a new object that is an array is created (�10
(Arrays), �15.10.2). The array components effectively cease to exist when the
array is no longer referenced.
4. Method parameters (�8.4.1) name argument values passed to a method.
For every parameter declared in a method declaration, a new parameter variable
is created each time that method is invoked (�15.12). The new variable is
initialized with the corresponding argument value from the method invocation.
The method parameter effectively ceases to exist when the execution of the
body of the method is complete.
5. Constructor parameters (�8.8.1) name argument values passed to a
constructor.
For every parameter declared in a constructor declaration, a new parameter
variable is created each time a class instance creation expression (�15.9) or
explicit constructor invocation (�8.8.7) invokes that constructor. The new
variable is initialized with the corresponding argument value from the creation
expression or constructor invocation. The constructor parameter effectively
ceases to exist when the execution of the body of the constructor is complete.
6. Lambda parameters (�15.27.1) name argument values passed to a lambda
expression body (�15.27.2).
For every parameter declared in a lambda expression, a new parameter variable
is created each time a method implemented by the lambda body is invoked
(�15.12). The new variable is initialized with the corresponding argument
value from the method invocation. The lambda parameter effectively ceases to
exist when the execution of the lambda expression body is complete.
7. An exception parameter is created each time an exception is caught by a catch
clause of a try statement (�14.20).
The new variable is initialized with the actual object associated with the
exception (�11.3, �14.18). The exception parameter effectively ceases to exist
when execution of the block associated with the catch clause is complete.
8. Local variables are declared by local variable declaration statements (�14.4).
Whenever the flow of control enters a block (�14.2) or for statement
(�14.14), a new variable is created for each local variable declared in a local
TYPES, VALUES, AND VARIABLES Variables 4.12
85
variable declaration statement immediately contained within that block or for
statement.
ATest.A local variable declaration statement may contain an expression which
initializes the variable. The local variable with an initializing expression is not
initialized, however, until the local variable declaration statement that declares
it is executed. (The rules of definite assignment (�16 (Definite Assignment))
prevent the value of a local variable from being used before it has been
initialized or otherwise assigned a value.) The local variable effectively ceases
to exist when the execution of the block or for statement is complete.
Were it not for one exceptional situation, a local variable could always be regarded
as being created when its local variable declaration statement is executed. The
exceptional situation involves the switch statement (�14.11), where it is possible for
control to enter a block but bypass execution of a local variable declaration statement.
Because of the restrictions imposed by the rules of definite assignment (�16 (Definite
Assignment)), however, the local variable declared by such a bypassed local variable
declaration statement cannot be used before it has been definitely assigned a value by
an assignment expression (�15.26).

	 */
	
	static int numPoints; // numPoints is a class variable
	 int x, y; // x and y are instance variables
	 static int[] w =new int[20]; // w[0] is an array component
	 int setX(int x) { // x is a method parameter
	 int oldx = this.x; // oldx is a local variable
	 this.x = x;
	 return oldx;
	 } 
	

}
