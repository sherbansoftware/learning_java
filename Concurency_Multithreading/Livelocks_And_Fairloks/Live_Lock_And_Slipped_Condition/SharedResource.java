package Concurency_Multithreading.Livelocks_And_Fairloks.Live_Lock_And_Slipped_Condition;


public class SharedResource {

    private Worker owner;

    public SharedResource(Worker owner) {
        this.owner = owner;
    }

    public Worker getOwner() {
        return owner;
    }

    public synchronized void setOwner(Worker owner) {
        this.owner = owner;
    }
}
