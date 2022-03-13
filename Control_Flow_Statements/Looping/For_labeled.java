package Control_Flow_Statements.Looping;

/*                                                   Java Labeled For Loop

    We can have a name of each Java for loop. To do so, we use label before the for loop. It is useful while using the
        nested for loop as we can break/continue specific for loop.

                                                      Syntax:

    labelname:
    for(initialization; condition; increment/decrement){
    //code to be executed
    }

 */

public class For_labeled {
    public static void main(String[] args) {
        //Using Label for outer and for loop
        label1:
        for (int i = 1; i <= 3; i++) {
            bb:
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                   break label1;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
