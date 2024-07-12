package edu.cuw.java.unit7;

public class Exercise12_9 {

    public static void main(String[] args) {
        AdjacencyList al = new AdjacencyList(10);
        al.addUndirectedEdge(0, 1);
        al.addUndirectedEdge(0, 5);
        al.addUndirectedEdge(0, 6);
        al.addUndirectedEdge(1, 2);
        al.addUndirectedEdge(1, 5);
        al.addUndirectedEdge(1, 6);
        al.addUndirectedEdge(1, 7);
        al.addUndirectedEdge(2, 3);
        al.addUndirectedEdge(2, 6);
        al.addUndirectedEdge(2, 7);
        al.addUndirectedEdge(2, 8);
        al.addUndirectedEdge(3, 4);
        al.addUndirectedEdge(3, 7);
        al.addUndirectedEdge(3, 8);
        al.addUndirectedEdge(3, 9);
        al.addUndirectedEdge(4, 8);
        al.addUndirectedEdge(4, 9);

        System.out.print("dfs of 0: ");
        al.dfs(0);

        System.out.print("bfs of 0: ");
        al.bfs(0);

        System.out.println("\ndfs2 of 0: ");
        al.dfs2(0);


        System.out.print("\nnew dfs2 of 0: ");
        al.dfs2New(0);

        System.out.println();

        System.out.print("\ndfs of 7: ");
        al.dfs(7);

        System.out.print("\ndfs2 of 7: ");
        al.dfs2(7);

        System.out.print("\nnew dfs2 of 7: ");
        al.dfs2New(7);

    }

}
