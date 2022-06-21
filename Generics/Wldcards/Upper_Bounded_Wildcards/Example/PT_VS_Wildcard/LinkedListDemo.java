package Generics.Wldcards.Upper_Bounded_Wildcards.Example.PT_VS_Wildcard;

public class LinkedListDemo {
    public static void main(String[] args) {

        DataNode<Integer> node2 = new DataNode<>(20,null);
        DataNode<Integer> node1 = new DataNode<>(35, node2);

        DataNode<Double> node22 = new DataNode<>(20.6,null);
        DataNode<Double> node11 = new DataNode<>(35.0, node22);

        DataNode<Number> node111 = new DataNode<>(55.2 ,null);

        // use <? extend Number> to restrict Type Parameter to only Numbers

         node111.setNext(node2);            //-- compilation error if not use wildcard



        // DataNode<Integer>,DataNode(Integer)

        System.out.println(node1.toString());
        System.out.println(node11.toString());

    }
}
