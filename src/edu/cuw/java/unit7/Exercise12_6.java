package edu.cuw.java.unit7;

public class Exercise12_6 {

    public static void main(String[] args) {

        AdjacencyList al = new AdjacencyList(10);
        al.addUndirectedEdge(0, 3);
        al.addUndirectedEdge(1, 2);
        al.addUndirectedEdge(2, 0);
        al.addUndirectedEdge(3, 1);
        al.addUndirectedEdge(4, 3);
        al.addUndirectedEdge(5, 7);
        al.addUndirectedEdge(6, 4);
        al.addUndirectedEdge(7, 8);
        al.addUndirectedEdge(8, 9);

        System.out.println("Spanning Forest:");
        al.spanningForest();

    }

}
