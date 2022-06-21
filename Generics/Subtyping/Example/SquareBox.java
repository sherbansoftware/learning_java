package Generics.Subtyping.Example;

import java.util.List;

public class SquareBox<T> extends Box<T> {
    public SquareBox(List<T> list) {
        super(list);
    }

    @Override
    public List<T> getList() {
        return super.getList();
    }
}
