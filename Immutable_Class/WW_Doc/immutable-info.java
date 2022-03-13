package Immutable_Class.WW_Doc;

/*
                                     Immutability:

        Should not change lang.classes.Object values once created

            1.Make the class as final so it can't be extended.
            2.Make variables as private so that direct access is not allowed.
            3.Make variable as final so that it's value can be assigned only once.
            4.No setter method for variables.
            5.Initialize all the fields via a constructor performing a deep copy.
            6.Perform cloning of objects in the getter methods to return a copy rather the returning the actual
             object reference (make Deep copy for lang.classes.Object)

          Benefits we get due to immutability:

            Saving Heap Space
            Good for HashMap Key
            Good for critical operation
            Good for Multiple thread operation. Thread safe



            immutable classes in Java

            wrapper classes (like Integer, Boolean, Byte, Short)
            String class
            BigDecimal

                                        NOTE



*/