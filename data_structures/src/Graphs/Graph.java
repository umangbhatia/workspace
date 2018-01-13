package Graphs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

import queues.QueuesUsingLL;

public class Graph {

	ArrayList<Vertex> vertices;
	
	Graph(){
		vertices = new ArrayList<>();
	}
	
	
	public void print(){
		for(Vertex v : vertices){
			v.print();
		}
	}
	public int numVertices(){
		return vertices.size();
	}
	public int numEdges(){
		int sum = 0;
		for(Vertex v: vertices){
			sum+=v.edges.size();
		}
		return sum/2;
	}
	public boolean havePath(String first, String second){
		Vertex v1 = getVertex(first);
		Vertex v2  = getVertex(second);
		if(v1 == null || v2 == null){
			return false;
		}
		HashMap<Vertex, Boolean> visited = new HashMap<>();
		visited.put(v1, true);
		return havePath(v1, v2, visited);
	}
	
	public boolean havePath(Vertex v1, Vertex v2, HashMap<Vertex, Boolean> visited) {
		// TODO Auto-generated method stub
		if(v1.isAdjacent(v2)){
			return true;
		}
		ArrayList<Vertex> adjacent = v1.getAdjacent();
		for(Vertex adj : adjacent){
			if(!visited.containsKey(adj)){
				visited.put(adj, true);
				if(adj.isAdjacent(v2)){
					return true;
				}else{
					return havePath(adj, v2, visited);
				}
			}
		}
		return false;
	}
	public boolean havePathBst(String first, String second) throws Exception{
		Vertex v1 = getVertex(first);
		Vertex v2  = getVertex(second);
		if(v1 == null || v2 == null){
			return false;
		}
		HashMap<Vertex, Boolean> visited = new HashMap<>();
		visited.put(v1, true);
		QueuesUsingLL<Vertex> q = new QueuesUsingLL<>();
		q.enqueue(v1);
		return havePath(v1, v2, visited, q);
	}


	private boolean havePath(Vertex v1, Vertex v2, HashMap<Vertex, Boolean> visited, QueuesUsingLL<Vertex> q) throws Exception {
		if(q.isEmpty()){
			return false;
		}
		Vertex current = q.dequeue();
		if(current.isAdjacent(v2)){
			return true;
		}
		ArrayList<Vertex> adjacent = v1.getAdjacent();
		for(Vertex adj : adjacent){
			if(!visited.containsKey(adj)){
				visited.put(adj, true);
				if(adj.isAdjacent(v2)){
					return true;
				}else{
					q.enqueue(adj);
					return havePath(adj, v2, visited, q);
				}
			}
		}
		return false;
	}


	public void addVertex(String name){
		if(isVertexPresent(name)){
			return;
		}
		
		Vertex v = new Vertex(name);
		vertices.add(v);
	}

	public void addEdge(String name1, String name2 ){
		if( !isVertexPresent(name1) || !isVertexPresent(name2)){
			return;
		}
		if(areAdjacent(name1, name2)){
			return;
		}
		
		Vertex first = getVertex(name1);
		Vertex second = getVertex(name2);
		Edge e = new Edge(first, second);
		first.addEdge(e);
		second.addEdge(e);
	}
	
	
	public  boolean areAdjacent(String name1, String name2) {
		Vertex v1 = getVertex(name1);
		Vertex v2 = getVertex(name2);
		
		if(v1 == null || v2== null){
			return false;
		}
		
		return v1.isAdjacent(v2);
		
	}

	
	public void removeVertex(String name){
		
		Vertex v = getVertex(name);
		if(v == null){
			return;
		}
		ArrayList<Vertex> adjacentVertices = v.getAdjacent();
		for(Vertex adj : adjacentVertices){
			adj.removeEdgeWith(v);
		}
		vertices.remove(v);
	}

	public void removeEdge(String name1, String name2){
		Vertex v1 = getVertex(name1);
		Vertex v2 = getVertex(name2);
		if(v1 == null || v2== null){
			return ;
		}
		if(!areAdjacent(name1, name2)){
			return;
		}
		
		v1.removeEdgeWith(v2);
		v2.removeEdgeWith(v1);
		
	}
	
	private Vertex getVertex(String name) {
		for(Vertex v : vertices){
			if(v.name.equals(name)){
				return v;
			}
		}
		return null;
	}


	private boolean isVertexPresent(String name) {
		for(Vertex v : vertices){
			if(v.name.equals(name)){
				return true;
			}
		}
		return false;
	}


	public Boolean havePath(Vertex v1, Vertex v2, HashMap<Vertex, Boolean> visited, boolean immediateNext) {
		// TODO Auto-generated method stub
		if(!immediateNext){
		if(v1.isAdjacent(v2)){
			return true;
		}
		immediateNext = false;
		}
		ArrayList<Vertex> adjacent = v1.getAdjacent();
		for(Vertex adj : adjacent){
			if(!visited.containsKey(adj)){
				visited.put(adj, true);
				if(adj.isAdjacent(v2)){
					return true;
				}else{
					return havePath(adj, v2, visited, false);
				}
			}
		}
		return false;
	}
	public int havePath(Vertex v1, Vertex v2, HashMap<Vertex, Boolean> visited, boolean immediateNext, int count) {
		// TODO Auto-generated method stub
		if(!immediateNext){
		if(v1.isAdjacent(v2)){
			return count;
		}
		immediateNext = false;
		}
		ArrayList<Vertex> adjacent = v1.getAdjacent();
		for(Vertex adj : adjacent){
			if(!visited.containsKey(adj)){
				visited.put(adj, true);
				if(adj.isAdjacent(v2)){
					return count;
				}else{
					return havePath(adj, v2, visited, false, count++);
				}
			}
		}
		return 0;
	}



	
	
}
