package lang.classes.SecurityManager.SecurityManager_Example;

public class Service {
    public static void main(String[] args) {
//        try {
//            System.setSecurityManager(new PasswordSecurityManager("Booga Booga"));
//        } catch (SecurityException se) {
//            System.out.println("SecurityManager already set!");
//        }
       operation();
    }
    public static final String OPERATION = "my-operation";

    public static void operation() {
        SecurityManager securityManager = System.getSecurityManager();

        if (securityManager != null) {
            securityManager.checkPermission(new CustomPermission(OPERATION));
        }
        System.out.println("Operation is executed");
    }
}
