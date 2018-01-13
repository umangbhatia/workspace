package Graph;



public class GraphUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		graph g = new graph();
		g.addVertex("A");
		g.addVertex("B");
		g.addVertex("C");
		g.addVertex("D");
		g.addEdge("A", "B");
		g.addEdge("A", "C");
		g.addEdge("B", "D");
//		System.out.println(g.havePath("B", "C"));
		System.out.println(g.numEdges());

	}

}
