package Classes.Class_Declarations.Abstract_Classes.SimpleExample;


public abstract class Machine {
    public int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void start();
    public abstract void shutDown();
    public abstract void doStuff();

    public void run() {
        start();
        doStuff();
        shutDown();
    }


}
