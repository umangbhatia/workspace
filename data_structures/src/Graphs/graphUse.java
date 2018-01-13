package Graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class graphUse {
	public static ArrayList<ArrayList<Vertex>> connected(Graph g){
		ArrayList<ArrayList<Vertex>> ans = new ArrayList<>();
		HashMap<Vertex, Boolean> visited = new HashMap<>();
		for(int i=0;i<g.vertices.size();i++){
			Vertex v = g.vertices.get(i);
			if(!visited.containsKey(v)){
				ArrayList<Vertex> x = new ArrayList<>();
				x.add(v);
				for(int j=i+1;j<g.vertices.size();j++){
					Vertex v1 = g.vertices.get(j);

					if(g.havePath(v.name, v1.name)){
						x.add(v1);
						visited.put(v1, true);
					}
				}
				visited.put(v, true);
				ans.add(x);
			}
		}
		return ans;		
	}
	public static boolean checkCycle(Graph g){
		ArrayList<Vertex> vertices = g.vertices;
		for(Vertex v: vertices){
			ArrayList<Vertex> adj = v.getAdjacent();

			for(int i=0;i<adj.size();i++){
				HashMap<Vertex, Boolean> visited = new HashMap<>();
				visited.put(v, true);
				visited.put(adj.get(i), true);
				boolean check = false;

				check = g.havePath(adj.get(i), v, visited, true);

				if(check){
					return true;
				}
			}
		}
		return false;
	}
	public static boolean checkBipartite(Graph g){
		ArrayList<Vertex> vertices = g.vertices;
		for(Vertex v: vertices){
			ArrayList<Vertex> adj = v.getAdjacent();

			for(int i=0;i<adj.size();i++){
				HashMap<Vertex, Boolean> visited = new HashMap<>();
				visited.put(v, true);
				visited.put(adj.get(i), true);
				int check = 0;

				check = g.havePath(adj.get(i), v, visited, true, 2);

				if(check%2==0){
					return true;
				}else{
					return true;
			}
		}
		return false;
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph();
		g.addVertex("A");
		g.addVertex("B");
		g.addVertex("C");
		g.addVertex("D");
		g.addEdge("A", "B");
		g.addEdge("A", "C");
		g.addEdge("B", "D");
		g.addEdge("A", "D");
		System.out.println(g.havePath("B", "C"));
		System.out.println(g.numEdges());
		ArrayList<ArrayList<Vertex>> ans = connected(g);
		for(int i=0;i<ans.size();i++){
			for(int j=0;j<ans.get(i).size();j++){
				System.out.print(ans.get(i).get(j).name+" ");
			}
			System.out.println();
		}
		System.out.println(graphUse.checkCycle(g));

	}

}
