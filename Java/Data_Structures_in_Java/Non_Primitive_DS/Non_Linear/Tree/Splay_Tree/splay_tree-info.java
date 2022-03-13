package Java.Data_Structures_in_Java.Non_Primitive_DS.Non_Linear.Tree.Splay_Tree;

// http://www.btechsmartclass.com/data_structures/splay-trees.html

/*                                               Splay tree

    Splay Tree is a self - adjusted Binary Search Tree in which every operation on element rearranges the tree so that
    the element is placed at the root position of the tree.

    In a splay tree, every operation is performed at the root of the tree. All the operations in splay tree are involved
     with a common operation called "Splaying".

     Splaying an element, is the process of bringing it to the root position by performing suitable rotation operations.

    By splaying elements we bring more frequently used elements closer to the root of the tree so that any operation on
    those elements is performed quickly.That means the splaying operation automatically brings more frequently used
    elements closer to the root of the tree.

    Rotations in Splay Tree

        1. Zig Rotation
        2. Zag Rotation
        3. Zig - Zig Rotation
        4. Zag - Zag Rotation
        5. Zig - Zag Rotation
        6. Zag - Zig Rotation

    Insertion Operation in Splay Tree

        Step 1 - Check whether tree is Empty.
        Step 2 - If tree is Empty then insert the newNode as Root node and exit from the operation.
        Step 3 - If tree is not Empty then insert the newNode as leaf node using Binary Search tree insertion logic.
        Step 4 - After insertion, Splay the newNode

    Deletion Operation in Splay Tree

        The deletion operation in splay tree is similar to deletion operation in Binary Search Tree.
        But before deleting the element, we first need to splay that element and then delete it from the root position.
        Finally join the remaining tree using binary search tree logic.


*/