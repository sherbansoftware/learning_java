package Generics.Wldcards.Upper_Bounded_Wildcards.Example.PT_VS_Wildcard;

public class DataNode<E> {

    private E data;
    private DataNode<? extends Number> next;

    public DataNode(E data, DataNode<? extends Number> next) {
        this.data = data;
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public DataNode<?> getNext() {
        return next;
    }

    public void setNext(DataNode<? extends Number> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "DataNode of: " + data.getClass().getSimpleName() + " [data =" + data +
                ", next=" + next + ']';
    }
}
