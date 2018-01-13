package Graph;

import java.util.ArrayList;

public class graph {
	ArrayList<Vertex> vertices;
	public graph() {
		// TODO Auto-generated constructor stub
		vertices = new ArrayList<>();
	}
	public void addVertex(String name){
		Vertex v = new Vertex(name);
		vertices.add(v);
	}
	public boolean addEdge(String first, String second){
		if(!isVertexPresent(first)||!isVertexPresent(second)){
			return false;
		}
		
			Vertex v1 = getVertex(first);
			Vertex v2 = getVertex(second);
			if(v1.isAdjacent(second)){
				return false;
			}
			Edge e = new Edge(v1, v2);
			v1.vertices.add(v2);
			v2.vertices.add(v1);
			return true;
		
	}
	private Vertex getVertex(String name) {
		for(Vertex v: vertices){
			if(v.name.equals(name)){
				return v;
			}
		}		return null;
	}
	public void removeVertex(String name){
		Vertex v = getVertex(name);
		if(v==null){
			return;
		}
		vertices.remove(v);
		for(Vertex x: vertices){
			if(x.areAdjacent(name)){
				x.vertices.remove(v);
			}
		}
		return;
	}
	public void removeEdge(String first, String second){
		if(!isVertexPresent(first)||!isVertexPresent(second)){
			return;
		}
		Vertex v1 = getVertex(first);
		Vertex v2 = getVertex(second);
		if(!v1.areAdjacent(second)){
			return;
		}
		v1.removeEdge(v2);
		v1.removeEdge(v2);
	}
	private boolean isVertexPresent(String name){
		for(Vertex v: vertices){
			if(v.name.equals(name)){
				return true;
			}
		}
		return false;
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

}
