package lang.classes.Package.Package_Example;


public class Package_App {
    public static void main(String[] args) {
        // get the Packages using getPackages() method
        Package[] packages = Package.getPackages();

        // print all packages, one by one
        for (int i = 0; i < packages.length; i++) {
            // System.out.println(packages[i]);
        }

        Package packageObj = Package.getPackage("lang.classes.Package_Members.Package_Example");
        int implTitle = packageObj.hashCode();


        System.out.println(implTitle);
    }
}
