package Reflection.Field.Setting_Field_Value;

// https://www.udemy.com/course/java-reflection-master-class/learn/lecture/21401198#questions

/*                                            Setting Field Value


    ○ field.set(instance, value);      -- value must be of the right type


                                              Setting Final Field Values


    ○ Setting final fields of an object using reflection

                  * is HIGHLY DISCOURAGED

          and the results may be unexpected.

    ○ In our implementation we prefer to

                 * set field values directly

                 * instead of passing them into the constructor

         as constructor parameter names

                 * are erased at compile time and are unavailable to us at runtime




 */

import java.lang.reflect.Field;

public class Setting_Field_Value {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Book book = new Book("Truth",1955);
      //  Book.class.getDeclaredField("year").set(book,2000);
        setFieldValue(book,"name","Black");

        System.out.println(book);

    }
    public static <T> void setFieldValue(T instance, String fieldName, Object value) throws NoSuchFieldException, IllegalAccessException {
        Class<T> clazz = (Class<T>) instance.getClass();
        Field field = clazz.getDeclaredField(fieldName);
        field.set(instance, value);

    }
}
 class Book {

    String name;
     int year;

     public Book(String name, int year) {
         this.name = name;
         this.year = year;
     }

     @Override
     public String toString() {
         return "Book{" +
                 "name='" + name + '\'' +
                 ", year=" + year +
                 '}';
     }
 }