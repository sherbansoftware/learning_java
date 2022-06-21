package Map.Map_Classes.WeakHashMap.Example;

public class Temp {

    public String toString() {
        return "temp";
    }

    public void finalize() {
        System.out.println("Finalize method called");
    }
}
