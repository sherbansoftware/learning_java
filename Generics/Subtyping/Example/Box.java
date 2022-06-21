package Generics.Subtyping.Example;

import java.util.List;

public class Box<T> {

    List<T> list;

    public List<T> getList() {
        return list;
    }

    public Box(List<T> list) {
        this.list = list;

    }

}
