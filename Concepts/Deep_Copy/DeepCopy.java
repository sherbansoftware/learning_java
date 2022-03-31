package Concepts.Deep_Copy;

/*                                                          Deep copy

    Whenever you try to create a copy of an object, in the deep copy all fields of the original objects are copied exactly,
        in addition to this, if it contains any objects as fields then copy of those is also created (using the clone() method).

    This implies that, if perform you deep copy on an object that contains reference (object), both the original and copied
        object refers to different objects and, if you do any changes to the data the copied object they are not reflected in the original object.

                                                               NOTE

            * In order to use this method, you need to make sure that your class implements the Cloneable interface.

 */

public class DeepCopy {
}
