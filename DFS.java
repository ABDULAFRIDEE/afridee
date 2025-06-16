package xyz;
import java.util.*;

class Graph {
    private Map<Integer, List<Integer>> adjList = new HashMap<>();

    void addEdge(int u, int v) {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.get(u).add(v);
        adjList.putIfAbsent(v, new ArrayList<>()); 
        adjList.get(v).add(u);
    }

    void dfs(int node, Set<Integer> visited) {
        if (visited.contains(node)) return; 

        System.out.print(node + " ");
        visited.add(node);

        for (int neighbor : adjList.getOrDefault(node, new ArrayList<>())) {
            dfs(neighbor, visited); 
        }
    }
}

public class DFS {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);

        Set<Integer> visited = new HashSet<>();
        System.out.println("DFS Traversal:");
        graph.dfs(0, visited);
    }
}
