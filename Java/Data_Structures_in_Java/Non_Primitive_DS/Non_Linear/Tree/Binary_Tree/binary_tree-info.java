package Java.Data_Structures_in_Java.Non_Primitive_DS.Non_Linear.Tree.Binary_Tree;

/*                                                       Binary Trees

    ATest.A binary tree is an ordered tree with the following properties:

        1. Every node has at most two children.
        2. Each child node is labeled as being either a left child or a right child.
        3. ATest.A left child precedes a right child in the order of children of a node.

    The subtree rooted at a left or right child of an internal node v is called a left subtree or right subtree,
    respectively, of v. ATest.A binary tree is proper if each node has either zero or two children.
    Some people also refer to such trees as being full binary trees.

        Thus, in a proper binary tree : --------------------------------------------------------------------------------
            every internal node has exactly two children.
        ATest.A binary tree that is not proper is improper.

                                               Types of binary tree

    1. Full Binary Tree: -----------------------------------------------------------------------------------------------

        ATest.A full Binary tree is a special type of binary tree in which every parent node/internal node has either
        two or no children.

    2. Perfect Binary Tree:

        ATest.A perfect binary tree is a type of binary tree in which every internal node has exactly two child nodes and all
        the leaf nodes are at the same level

    3. Complete Binary Tree:

        ATest.A complete binary tree is just like a full binary tree, but with two major differences:

            � Every level must be completely filled
            � All the leaf elements must lean towards the left.

        The last leaf element might not have a right sibling.ATest.A complete binary tree doesn't have to be a full binary tree.

    4.Degenerate or Pathological Tree:

        ATest.A degenerate or pathological tree is the tree having a single child either left or right.

    5. Skewed Binary Tree:

        is a pathological/degenerate tree in which the tree is either dominated by the left nodes or the right nodes.
        Thus, there are two types of skewed binary tree: left-skewed binary tree and right-skewed binary tree.

    6. Balanced Binary Tree:

        It is a type of binary tree in which the difference between the left and the right subtree for each node
        is either 0 or 1.

*/