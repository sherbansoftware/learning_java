package lang.classes.Short.Short_Example;

public class Short_App {
    public static void main(String[] args) {
        String shs ="4556165165";

    //  Short sh = Short.valueOf(shs);

      Short s = Short.decode(shs);

        System.out.println(s.getClass());
    }
}
