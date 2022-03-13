package util.interfaces.Collection.Collection_Example.Boolean_Add;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Ensures that this collection contains the specified element (optional
 * operation).  Returns <tt>true</tt> if this collection changed as a
 * result of the call.  (Returns <tt>false</tt> if this collection does
 * not permit duplicates and already contains the specified element.)<p>
 * <p>
 * anim that support this operation may place limitations on what
 * elements may be added to this collection.  In particular, some
 * anim will refuse to add <tt>null</tt> elements, and others will
 * impose restrictions on the type of elements that may be added.
 * Collection classes should clearly specify in their documentation any
 * restrictions on what elements may be added.<p>
 * <p>
 * If a collection refuses to add a particular element for any reason
 * other than that it already contains the element, it <i>must</i> throw
 * an exception (rather than returning <tt>false</tt>).  This preserves
 * the invariant that a collection always contains the specified element
 * after this call returns.
 *
 * @param_ e element whose presence in this collection is to be ensured
 * @return <tt>true</tt> if this collection changed as a result of the
 * call
 * @throws UnsupportedOperationException if the <tt>add</tt> operation
 * is not supported by this collection
 * @throws ClassCastException if the class of the specified element
 * prevents it from being added to this collection
 * @throws NullPointerException if the specified element is null and this
 * collection does not permit null elements
 * @throws IllegalArgumentException if some property of the element
 * prevents it from being added to this collection
 * @throws IllegalStateException if the element cannot be added at this
 * time due to insertion restrictions
 **/
//   boolean add(E e);

public class Boolean_Add_Class {

    public static void main(String[] args) {
        Collection<String> anim;
        anim = new ArrayList<>();
        anim.add("Horse");
        anim.add("Dog");
        anim.add("Cat");
        anim.add("Bird");
        anim.add("Cat");
        anim.add(null);
        anim.add(null);
        anim.add("");

        System.out.println(anim.size());
        anim.forEach(c -> System.out.println(c));
    }
}
