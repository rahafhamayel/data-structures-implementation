package Day5.graph;

import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<Integer>[] adj;

    public Graph(int v) {
        this.vertices = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList<>();
    }

    public void addEdge(int v, int w) {
        adj[v].add(w); // directed edge
    }


    public void BFS(int start) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : adj[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }


    public void DFS(int start) {
        boolean[] visited = new boolean[vertices];
        DFSUtil(start, visited);
    }

    private void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int neighbor : adj[v]) {
            if (!visited[neighbor])
                DFSUtil(neighbor, visited);
        }
    }
}
