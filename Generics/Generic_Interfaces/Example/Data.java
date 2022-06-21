package Generics.Generic_Interfaces.Example;

public class Data<T> implements IData<T> {

    // T type parameter

    private T data;

    public Data(T data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "Data{" +
                "data=" + data +
                '}';
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T data) {

    }


}
