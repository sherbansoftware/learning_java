package lang.classes.Boolean.Boolean_Example;

import java.lang.reflect.Field;

public class Boolean_Example_App {



    public static void main(String[] args) {

        Class<Boolean> bc = Boolean.class;

        Class<Boolean> btype = Boolean.TYPE;
        System.out.println("Type: " + btype + " === " + btype.getClass());


        Boolean  st=   Boolean.TRUE;
        System.out.println(st.getClass());



        for (Field f: bc.getFields() ) {

            System.out.println("fields "  + f);
        }
    }
}
