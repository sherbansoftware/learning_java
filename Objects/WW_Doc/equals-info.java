package Objects.WW_Doc;

/* 
      Indicates whether some other object is"equal to"this one.
         
  The equals method implements an equivalence relation on non-null object references:
         
   It is reflexive :for any non-null reference value

            x ,   x.equals(x) should return    true .
     
  It is symmetric :for any non-null reference values

            x and   y ,   x.equals(y)  should return   true if and only if
            y.equals(x) returns true .
       
  It is transitive :for any non-null reference values

            x ,   y ,and   z ,if
            x.equals(y) returns   true and  y.equals(z) returns   true ,then x.equals(z) should return   true .
          It is consistent :for any non-null reference values
            x and   y ,multiple invocations of
            x.equals(y) consistently return   true 
         or consistently return   false ,provided no
         information used in   equals comparisons on the
         objects is modified.
          For any non-null reference value   x ,
            x.equals(null) should return   false .

  The   equals method for class Object implements the most discriminating possible equivalence relation on objects;
         that is,for any non-null reference values   x and y ,this method returns   true if and only
         if   x and   y refer to the same object
         (   x==y has the value   true ).

  Note that it is generally necessary to override the hashCode method whenever this method is overridden,so as to

         maintain the general contract for the hashCode method,which states that equal objects must have equal hash codes.
         
         @param obj the reference object with which to compare.
         @return   true if this object is the same as the obj
         argument;   false otherwise.
         @see #hashCode()
         @see java.util.HashMap

public boolean equals(Object obj) 
        return(this==obj);
        
  */