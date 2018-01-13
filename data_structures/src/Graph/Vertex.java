package Graph;

import java.util.ArrayList;
import java.util.HashMap;





public class Vertex {
	String name;
	
	ArrayList<Edge> edges;
	public Vertex(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		edges = new ArrayList<>();
	}
	public void addEdge(Edge x){
		edges.add(x);
	}
	
	public ArrayList<Vertex> getAdjacent(){
		ArrayList<Vertex> vertices = new ArrayList<>();
		for(Edge e:edges ){
			if(e.first!=this){
				vertices.add(e.first);
			}else{
				vertices.add(e.second);
			}
		}
		return vertices;
	}
	public boolean isAdjacent(Vertex v2) {
		
		for(Edge e : edges){
			if(e.first == v2 || e.second == v2){
				return true;
			}
		}	
		return false ;
	}

	public void removeEdgeWith(Vertex v2) {
		for(int i = 0; i < edges.size(); i++){
			Edge currentEdge = edges.get(i);
			if(currentEdge.first == v2 || currentEdge.second == v2){
				edges.remove(i);
				break;
			}
		}
		
	}

	public void print() {
		String toBePrinted = this.name +" : ";
		for(Edge e : edges){
			if(e.first == this){
				toBePrinted += e.second.name +", ";
			}
			else{
				toBePrinted += e.first.name +", ";
			}
		}
		System.out.println(toBePrinted);
	}

}
