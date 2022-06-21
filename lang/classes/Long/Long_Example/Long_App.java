package lang.classes.Long.Long_Example;

import java.lang.reflect.Field;

public class Long_App {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(Long.BYTES);

        System.out.println(Long.SIZE);

      //  Class<Long> cl = Long.class;
        Class cl = Class.forName("java.lang.Long");


        System.out.println(cl.getClass());
        Field[] fld = cl.getFields();

        System.out.println("Field " + fld.toString());
        for (Field f : fld) {
            System.out.println(f);

        }

    }
}
