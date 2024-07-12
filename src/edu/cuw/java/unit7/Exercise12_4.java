package edu.cuw.java.unit7;

public class Exercise12_4 {

    public static void main (String[] args) {

        AdjacencyList al = new AdjacencyList(4);
        al.addEdge(0, 3);
        al.addEdge(1, 2);
        al.addEdge(2, 0);
        al.addEdge(3, 1);

        System.out.println("Connected? " + al.isConnected(1, 2));

        al.addEdge(2, 1); //Add the connection for undirected graph

        System.out.println("Connected Now? " + al.isConnected(1, 2));
    }

}
