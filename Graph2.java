package xyz;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graph2 {
	static class graph{
		private Map<Integer,List<Integer>> adj=new HashMap<Integer,List<Integer>>();
		void addEdge(int u,int v) {
			adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
			adj.computeIfAbsent(v,k -> new ArrayList<>()).add(u);
			
		}
		void printGraph() {
			for(int node: adj.keySet()) {
				System.out.println("Node "+node+" is connected to: ");
				for(int neighbour:adj.get(node)) {
					System.out.println(neighbour+"");
				}
			}
			
		}
	}

	public static void main(String[] args) {
		graph g=new graph();
		g.addEdge(1,2);
		g.addEdge(1,3);
		g.addEdge(1,4);
		g.addEdge(2,5);
		g.printGraph();
		
		
		

	}

}
