package xyz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DFS_DEMO  {
	private Map<String,List<String>> homemap=new HashMap<String, List<String>>();
	private Set<String> vis=new HashSet<String>();
	public void assRoom(String room,String connectedRoom)
	{
		homemap.computeIfAbsent(room, K-> new ArrayList<>()).add(connectedRoom);
		homemap.computeIfAbsent(connectedRoom, K->new ArrayList<>()).add(room);
	}
		public void dfs(String currentRoom)
		{
			if(vis.contains(currentRoom)) return ;
			vis.add(currentRoom);
			System.out.println("vistied :"+currentRoom);
			for(String neighbor:homemap.getOrDefault(currentRoom, new ArrayList<String>()))
			{
				dfs(neighbor);
		}
		}
		public static void main(String[] args) {
		DFS_DEMO home=new DFS_DEMO();
		home.assRoom("Livingroom","Kitchen");
		home.assRoom("Livingroom","Bedroom");
		home.assRoom("Bedroom", "Bathroom");
		System.out.println("Dfs traversal starting form Living room:");
		home.dfs("Livingroom");
		}}

