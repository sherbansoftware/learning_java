package Generics.Generic_Classes.Nested_Generic_Classes;

// https://docs.oracle.com/javase/specs/jls/se8/html/jls-8.html#d5e11116

/*

 */

//  Example 8.1.2-2. Nested Generic Classes

class Seq<T> {
    T head;
    Seq<T> tail;

    Seq() {
        this(null, null);
    }

    Seq(T head, Seq<T> tail) {
        this.head = head;
        this.tail = tail;
    }

    boolean isEmpty() {
        return tail == null;
    }

    class Zipper<S> {
        Seq<Pair<T, S>> zip(Seq<S> that) {
            if (isEmpty() || that.isEmpty()) {
                return new Seq<Pair<T, S>>();
            } else {
                Seq<T>.Zipper<S> tailZipper =
                        tail.new Zipper<S>();
                return new Seq<Pair<T, S>>(
                        new Pair<T, S>(head, that.head),
                        tailZipper.zip(that.tail));
            }
        }
    }
}

class Pair<T, S> {
    T fst;
    S snd;

    Pair(T f, S s) {
        fst = f;
        snd = s;
    }
}

class Nested_Generic_Classes {
    public static void main(String[] args) {
        Seq<String> strs =
                new Seq<String>(
                        "a",
                        new Seq<String>("b",
                                new Seq<String>()));
        Seq<Number> nums =
                new Seq<Number>(
                        new Integer(1),
                        new Seq<Number>(new Double(1.5),
                                new Seq<Number>()));

        Seq<String>.Zipper<Number> zipper =
                strs.new Zipper<Number>();

        Seq<Pair<String, Number>> combined =
                zipper.zip(nums);
    }
}