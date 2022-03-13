package lang.classes.Object.Object_Example.Clone.Clone_Example;

public class Student implements Cloneable {

    public int colg_id;

    public Student () {
        System.out.println ("Student class constructor");
    }

    public int getColg_id() {
        return colg_id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone ();
    }



}
