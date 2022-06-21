package Interfaces.Example;

public class App_Interface {
    public static void main(String[] args) {
        Machine mach1 = new Machine();
        Info info1 = new Machine();
        info1.showInfo();

        Person person1 = new Person("John");
        Info info2 = person1;
        info2.showInfo();

        Info[] infos = {info1, info2};
        System.out.println("-----------------------------------------");
        outputInfo(infos);

    }

    public static void outputInfo(Info[] infos) {
        for (Info info : infos) {
            info.showInfo();
        }
    }
}
