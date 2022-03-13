package Basic_Principles_OOP.WW_Doc.Example;

public class Tree extends Plant {
    @Override
    public void grow() {
        System.out.println("Tree growing");
    }

    public void shedLeaves() {
        System.out.println("Leaves fall");
    }
}
