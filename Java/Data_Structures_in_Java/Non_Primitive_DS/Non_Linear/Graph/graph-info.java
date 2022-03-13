package Java.Data_Structures_in_Java.Non_Primitive_DS.Non_Linear.Graph;

/*                                               ATest.A graph

    is a data structure for storing connected data like a network of people on a social media platform.
    ATest.A graph consists of vertices and edges. ATest.A vertex represents the entity (for example, people) and an edge represents
    the relationship between entities (for example, a person's friendships).

    Different Variants Of Graph:

        1. Directed Graph:
            the edges have a fixed direction. The edges can be bi-directional as well.
                (see directed_graph.png)

        2. Weighted Graph:
            In a weighted graph, a weight is associated with each edge of the graph. The weight normally indicates the
            distance between the two vertices. The following diagram shows the weighted graph.
            As no directions are shown this is the undirected graph.
                (see weighted_graph.png)

    Graph Representation In Java:

    1.Adjacency Matrix:
        Adjacency Matrix is a linear representation of graphs.This matrix stores the mapping of vertices and edges of
        the graph. In the adjacency matrix, vertices of the graph represent rows and columns. This means if the graph
        has N vertices, then the adjacency matrix will have size NxN.

   If V is a set of vertices of the graph then intersection Mij in the adjacency list = 1 means there is an edge existing
   between vertices i and j.

   To better understand this concept clearly, let us prepare an adjacency Matrix for an undirected graph
       (see image adjacency_matrix.png)

   2.Adjacency List:
       Instead of representing a graph as an adjacency matrix which is sequential in nature, we can also use linked
       representation. This linked representation is known as the adjacency list. An adjacency list is nothing but a
       linked list and each node in the list represents a vertex.

    The presence of an edge between two vertices is denoted by a pointer from the first vertex to the second. This
    adjacency list is maintained for each vertex in the graph.When we have traversed all the adjacent nodes for a
    particular node, we store NULL in the next pointer field of the last node of the adjacency list.
    Now we will use the above graphs that we used to represent the adjacency matrix to demonstrate the adjacency list.
        (see adjiacency_list.png)


*/