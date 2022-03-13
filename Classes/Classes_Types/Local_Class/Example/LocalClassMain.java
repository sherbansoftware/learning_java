package Classes.Classes_Types.Local_Class.Example;

import java.util.Scanner;

public class LocalClassMain {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print button");

    public static void main(String... args) {
//        //	LocalClassExample.validatePhoneNumber("123-456-7890", "456-7890");
//        class ClickListener implements Button.OnClickListener {
//
//            public ClickListener() {
//                System.out.println("I ve been attached'");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked!");
//            }
//        }
//        btnPrint.setOnClickListener(new ClickListener());

        // Anonimous class
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }

    public static void listen() {
        boolean quit = false;
        while (!quit) {
            System.out.println("Enter your choice: ");
            int ins = scanner.nextInt();
            scanner.nextLine();
            switch (ins) {
                case 0:
                    quit = true;
                    System.out.println("Exit...");
                    break;
                case 1:
                    btnPrint.onClick();
                    break;

            }
        }
    }
}
