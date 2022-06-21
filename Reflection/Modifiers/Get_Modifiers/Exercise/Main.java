package Reflection.Modifiers.Get_Modifiers.Exercise;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

      String client =  JsonWriter.objectToJson(new Client(21,"John","Dunkan","California"));

        System.out.println(client);
    }

}
