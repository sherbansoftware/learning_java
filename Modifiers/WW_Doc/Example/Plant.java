package Modifiers.WW_Doc.Example;

public class Plant {
    // bad practice
    public String name;
    // acceptable practice
    public static final int ID = 8;
    // best practice
    private String type;
    protected String size;
    int height;

    public Plant() {
        this.name = "Freddy";
        this.type = "plant";
        this.size = "medium";
        this.height = 7;
    }
}
