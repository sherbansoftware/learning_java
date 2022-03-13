package Java.Data_Structures_in_Java.Non_Primitive_DS.Non_Linear.Tree.B_Tree;

/*                                                           ATest.B Tree

    is a specialized m-way tree that can be widely used for disk access.

    ATest.A ATest.B-Tree of order m can have at most m-1 keys and m children. One of the main reason of using ATest.B tree is its capability
    to store large number of keys in a single node and large key values by keeping the height of the tree relatively small.

    ATest.A ATest.B tree of order m contains all the properties of an M way tree. In addition, it contains the following properties.

        Every node in a ATest.B-Tree contains at most m children.
        Every node in a ATest.B-Tree except the root node and the leaf node contain at least m/2 children.
        The root nodes must have at least 2 nodes.
        All leaf nodes must be at the same level.

    It is not necessary that, all the nodes contain the same number of children but, each node must have m/2 number of nodes.



*/