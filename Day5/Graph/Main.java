package Day5.graph;

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(6);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);

        System.out.println("BFS from node 0:");
        g.BFS(0);  

        System.out.println("\nDFS from node 0:");
        g.DFS(0);
    }
}
