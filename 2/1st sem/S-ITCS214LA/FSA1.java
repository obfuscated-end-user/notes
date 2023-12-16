import java.util.LinkedList;
import java.util.Iterator;

public class FSA1 {
    public static void main(String[] args) {
        Graph graph1 = new Graph(7);
        graph1.addEdge(1, 2);
        graph1.addEdge(1, 3);
        graph1.addEdge(2, 4);
        graph1.addEdge(3, 4);
        graph1.addEdge(4, 5);
        graph1.addEdge(5, 6);
        System.out.println("BFS");
        graph1.BFS(1);
        System.out.println("\nDFS");
        graph1.DFS(1);
    }
}

class Graph {
    private int Vertices;
    private LinkedList<Integer> adj_list[];

    @SuppressWarnings("unchecked")
    Graph(int v) {
        Vertices = v;
        adj_list = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj_list[i] = new LinkedList();
    }

    void addEdge(int v, int w) {
        adj_list[v].add(w);
    }

    void BFS(int root_node) {
        boolean visited[] = new boolean[Vertices];
        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[root_node] = true;
        queue.add(root_node);

        while (queue.size() != 0) {
            root_node = queue.poll();
            System.out.print(root_node + " ");

            Iterator<Integer> i = adj_list[root_node].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    void DFS(int v) {
        boolean visited[] = new boolean[Vertices];
        DFS_helper(v, visited);
    }

    void DFS_helper(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> i = adj_list[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFS_helper(n, visited);
        }
    }
}