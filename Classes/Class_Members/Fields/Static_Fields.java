package Classes.Class_Members.Fields;

/*                                                        Static Fields

        If a field is declared static,
          there exists exactly one incarnation of the field, no matter how many instances (possibly zero) of the class
          may eventually be created. A static field, sometimes called a class variable, is incarnated when the class is
          initialized.

                                                        use for

         * when are not interacted with instance variable
         * to count object created
         * to allocate an id to every object created

 */
class Thing {

    public final static int LUCKY_NUMBER = 7;
    public String name;
    public static String description;
    public static int count = 0;
    public int id;

    public Thing() {
        id = count;
        count++;
    }

    public void showName() {
        System.out.println("Object id: " + id + ", " + description + ": " + name);
    }

    public static void showInfo() {
        System.out.println(description);
        // Won't work: System.out.println(name);
    }
}

public class Static_Fields {
    public static void main(String[] args) {

        Thing.description = "I am a thing";

        Thing.showInfo();

        System.out.println("Before creating objects, count is: " + Thing.count);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        System.out.println("After creating objects, count is: " + Thing.count);

        thing1.name = "Bob";
        thing2.name = "Sue";

        thing1.showName();
        thing2.showName();

        System.out.println(Math.PI);
        System.out.println(Thing.LUCKY_NUMBER);
    }
}
