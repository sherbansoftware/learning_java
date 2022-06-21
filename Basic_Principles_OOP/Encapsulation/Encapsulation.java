package Basic_Principles_OOP.Encapsulation;

/*                                            Encapsulation in Java

    is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
        In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through
        the methods of their current class. Therefore, it is also known as data hiding.

    To achieve encapsulation in Java −

            * Declare the variables of a class as private.
            * Provide public setter and getter methods to modify and view the variables values.

                                                 Benefits of Encapsulation

            * The fields of a class can be made read-only or write-only.
            * A class can have total control over what is stored in its fields.


                                                      NOTE

    Now the idea is that, you want to make everything you can private.

    If it needs to be accessible in a child class, then make it protected.

    And finally, the stuff that you actually want your end users tp be able to use make that public but try not to make
        any data public except for constants.

    So make everything as private as you can.Keep everything hidden within the class.

    And the idea is to reduce one of, another part of the ideas is to reduce cross languages in your project.

    So you don't want one class kind of getting into another class's stuff and using it.

    So that's the idea behind the encapsulation, and as I, as I said, the advantages are that you, you hide away the
        implementation details within your class and just provide a public API programming interface.

    In other words, just some public methods.

    And you also reduce, you also prevent classes being tightly coupled, which means, two classes are tightly coupled
        if they're calling each other stuff all the time.

 */

public class Encapsulation {
    public static final int ID = 7;
    private String name;
    private String idNum;
    private int age;


    public String getData() {
        String data = "some stuff " + calculateGrowthForecast() ;
        return data;
    }

    private int calculateGrowthForecast() {
        return 9;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public void setName(String newName) {
        name = newName;
    }

    public static void main(String[] args) {
        Encapsulation encap = new Encapsulation();
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("12343ms");

        System.out.print("Name : " + encap.getName() + " \nAge : " + encap.getAge());
    }
}
