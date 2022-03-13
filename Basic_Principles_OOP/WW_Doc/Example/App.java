package Basic_Principles_OOP.WW_Doc.Example;

/*
  * if you have a child class of some parent class, you can always use the child class anywhere where you would normally
         use the parent class.
 */

public class App {
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        Tree tree = new Tree();
        Plant plant2 = tree;

        plant1.grow();
        doGrow(tree);

    }

    public static void doGrow(Plant plant) {
        plant.grow();
    }

}
