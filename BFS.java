package xyz;
import java.util.*;

		public class BFS {
		    public static void main(String[] args) {
		        
		        Map<Integer, List<Integer>> graph = new HashMap<>();
		        graph.put(0, Arrays.asList(1, 2));
		        graph.put(1, Arrays.asList(3, 4));
		        graph.put(2, Arrays.asList(4));
		        graph.put(3, Arrays.asList(5));
		        graph.put(4, Arrays.asList(5));
		        graph.put(5, new ArrayList<>());

		        bfs(graph, 0); 
		    }

		    public static void bfs(Map<Integer, List<Integer>> graph, int start) {
		        Queue<Integer> queue = new LinkedList<>();
		        Set<Integer> visited = new HashSet<>();

		        queue.add(start);
		        visited.add(start);

		        System.out.println("BFS Traversal:");
		        while (!queue.isEmpty()) {
		            int node = queue.poll();
		            System.out.print(node + " ");

		            for (int neighbor : graph.get(node)) {
		                if (!visited.contains(neighbor)) {
		                    visited.add(neighbor);
		                    queue.add(neighbor);
		                }
		            }
		        }
		    }
		}
		
		

	


