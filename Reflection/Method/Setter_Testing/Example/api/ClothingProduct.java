

package Reflection.Method.Setter_Testing.Example.api;

public class ClothingProduct extends Product {
    private Size size;
    private String color;

    // Getters
    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    // Setters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
