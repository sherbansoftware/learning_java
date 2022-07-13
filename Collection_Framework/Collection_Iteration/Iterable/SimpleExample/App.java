package Collection_Framework.Collection_Iteration.Iterable.SimpleExample;

public class App {
    public static void main(String[] args) {
        UrlLibrary urlLibrary = new UrlLibrary();

        for (String html  : urlLibrary) {
            System.out.println(html.length());
            System.out.println(html);

        }
    }
}
