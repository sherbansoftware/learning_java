package Generics.Generic_Methods.Example;


import java.util.Collections;
import java.util.List;

public class GenericConstructor {

    List list;

    public <T> GenericConstructor(List<T> list) {
        this.list = Collections.unmodifiableList(list);
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = Collections.unmodifiableList(list);
    }

}
