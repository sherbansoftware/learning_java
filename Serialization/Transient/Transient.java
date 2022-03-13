package Serialization.Transient;

// https://www.baeldung.com/java-transient-keyword

/*                                                    Transient keyword

    When we mark any variable as transient, then that variable is not serialized. Since transient fields aren't present
        in the serialized form of an object, the deserialization process would use the default values for such fields when
        creating an object out of the serialized form.

   The transient keyword is useful in a few scenarios:

           * We can use it for derived fields
           * It is useful for fields that do not represent the state of the object
           * We use it for any non-serializable references

    The final modifier makes no difference – because the field is transient, no value is saved for that field. During
        deserialization, the new Book object gets the default value Fiction that’s defined in the Book class, but that
        value doesn’t come from the serialization data:

 */

public class Transient {
}
