package Concepts.Coupling;

/*                                               Coupling

    ○ Coupling is a measure of how much a class is DEPENDENT on other classes.
      
                  * There should be minimal dependencies between classes.
   
          So, we should always aim for low coupling between classes.

    ○ In object-oriented design, Coupling refers to the 
    
                  * degree of direct knowledge that one element has of another.
                  
          In other words, how often do changes in class A force related changes in class B.


                                                       Tight coupling


    ○ When an object CREATES the object to be used,

                  * then it is a Tight coupling situation.

          As the main object creates the object itself,

                  * this object can not be changed from outside world

          easily marked it as Tightly Coupled objects.


                                                    Loose coupling


    ○ When an object GETS the object to be used from the outside,

                  * then it is a Loose coupling situation.

          As the main object is merely using the object,

                  * this object can be changed from the outside world

          easily marked it as loosely coupled objects.


*/

public class Coupling{}