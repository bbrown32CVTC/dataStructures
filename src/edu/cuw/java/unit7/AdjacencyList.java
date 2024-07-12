package edu.cuw.java.unit7;

import java.util.*;

public class AdjacencyList {
    int n;
    List<Integer>[] adj;
    ArrayList<Integer> vertices;
    int count = 0;

    public AdjacencyList(int n) {
        this.n = n;
        this.adj =  (List<Integer>[])new List[n];

        for (int i = 0; i < this.n; i++) {
            this.adj[i] = new Stack<Integer>();
        }
    }

    public void addEdge(int i, int j) {
        this.adj[i].add(j);
    }

    public void addUndirectedEdge(int i, int j) {
        this.adj[i].add(j);
        this.adj[j].add(i);
    }

    public void removeEdge(int i, int j) {
        Iterator<Integer> it = this.adj[i].iterator();

        while (it.hasNext()) {
            if (it.next() == j) {
                it.remove();
                return;
            }
        }

    }

    public void removeUndirectedEdge(int i, int j) {
        Iterator<Integer> it = this.adj[i].iterator();

        while (it.hasNext()) {
            if (it.next() == j) {
                it.remove();
                break;
            }
        }

        it = this.adj[j].iterator();

        while (it.hasNext()) {
            if (it.next() == j) {
                it.remove();
                break;
            }
        }

    }

    public boolean hasEdge(int i, int j) {
        return this.adj[i].contains(j);
    }

    public List<Integer> outEdges(int i) {
        return this.adj[i];
    }

    public List<Integer> inEdges(int i) {
        List<Integer> edges = new Stack<>();

        for (int j = 0; j < this.n; j++) {
            if (this.adj[j].contains(i)) {
                edges.add(j);
            }
        }

        return edges;
    }

    public void bfs(int r) {
        boolean[] seen = new boolean[this.adj.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(r);
        seen[r] = true;

        while (!q.isEmpty()) {
            int i = q.remove();
            for (Integer j : outEdges(i)) {
                if (!seen[j]) {
                    System.out.print(", " + j);
                    q.add(j);
                    seen[j] = true;
                }
            }
        }
    }

    public void dfs(int r) {
        byte[] c = new byte[this.adj.length];
        System.out.print(r);
        dfs(r, c);
    }

    public void dfs(int i, byte[] c)  {
        // 0 = white, 1 = gray, 2 = black
        c[i] = 1;  //Currently visiting i

        for (Integer j : outEdges(i)) {
            if (c[j] == 0) {
                c[j] = 1;
                System.out.print(", " + j);
                dfs(j, c);
            }
        }

        c[i] = 2;  //Done visiting i
    }


    public void dfs2(int r) {
        // 0 = white, 1 = gray, 2 = black
        byte[] c = new byte[this.adj.length];
        Stack<Integer> s = new Stack<>();
        s.push(r);

        while (!s.isEmpty()) {
            int i = s.pop();
            if (c[i] == 0) {
                c[i] = 1;
                System.out.print(i + ", ");
                for (int j : outEdges(i)) {
                    s.push(j);
                }
            }
        }
    }

    public void dfs2New(int r) {
        // 0 = white, 1 = gray, 2 = black
        byte[] c = new byte[this.adj.length];
        Queue<Integer> q = new LinkedList<>();
        q.add(r);

        while (!q.isEmpty()) {
            int i = q.remove();
            if (c[i] == 0) {
                c[i] = 1;
                System.out.print(i + ", ");
                for (int j : outEdges(i)) {
                    q.add(j);
                    if (outEdges(j).size() > 1) {
                        q.add(outEdges(j).get(1));
                    }

                }
            }
        }
    }

    public void dfsConnection(int i, boolean[] visited) {
        visited[i] = true;
        System.out.print(i + " ");
        for (int j : this.adj[i]) {
            if (!visited[j]) {
                dfsConnection(j, visited);
            }
        }
    }
    public void dfsConnection2(int i, boolean[] visited) {
        visited[i] = true;
        for (int j : this.adj[i]) {
            if (!visited[j]) {
                this.vertices.add(j);
                dfsConnection2(j, visited);
            }
        }

    }

    public void connectedComponentLabelling() {
        boolean[] visited = new boolean[this.adj.length];
        for (int i = 0; i < this.adj.length; i++) {
            if (!visited[i]) {
                dfsConnection(i, visited);
                System.out.println();
            }
        }
    }

    public void spanningForest() {
        for (int i = 0; i < this.adj.length; i++) {
            boolean[] visited = new boolean[this.adj.length];
            dfsConnection(i, visited);
            System.out.println();
        }
    }

    public boolean isConnected(int i, int j) {
        return (hasEdge(i, j) && hasEdge(j, i));
    }

    public void vertexDistance(int r, int i, int distance, boolean[] visited, int connections, int prev) {
        visited[r] = true;

        for (int m = i; m < this.n; m++) {

            if (m == r) {
                System.out.println();
                System.out.print("Distance from r(" + r + ") to i(" + r + ") : " + distance);

            } else {

                for (int j : inEdges(i)) {
                    prev = j;
                    if (!visited[j]) {
                        distance++;
                        visited[j] = true;
                        System.out.println();
                        System.out.print("Distance from r(" + r + ") to i(" + j + ") : " + distance);
                        this.count++;
                    }
                }

                for (int j : outEdges(prev)) {
                    if (!visited[j]) {
                        distance++;
                        visited[j] = true;
                        System.out.println();
                        System.out.print("Distance from r(" + r + ") to i(" + j + ") : " + distance);
                        this.count++;
                    }
                }

                if (this.count < connections) {
                    vertexDistance(r, prev, distance, visited, connections, prev);

                } else {
                    System.out.println();
                    return;
                }

            }

        }

    }

    public void shortestPaths(int r) {
        boolean[] visited = new boolean[this.n];
        this.vertices = new ArrayList<>();
        dfsConnection2(r, new boolean[this.n]);
        int connections = this.vertices.size();
        this.count = 0;
        vertexDistance(r, r, 0, visited, connections, r);
    }

}
