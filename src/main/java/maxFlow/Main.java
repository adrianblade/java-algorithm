package maxFlow;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ANIRUDDHA
 */
 
public class Main {

	public static void main(String[] args) {

		//Create a graph
		Graph graph = new Graph(8);
		
		// Create vertices
		Vertex vertex0 = new Vertex(0,"s");
                Vertex vertex1 = new Vertex(1,"1");
                Vertex vertex2 = new Vertex(2,"2");
                Vertex vertex3 = new Vertex(3,"3");
		Vertex vertex4 = new Vertex(4,"4");
		Vertex vertex5 = new Vertex(5,"5");
		Vertex vertex6 = new Vertex(6,"6");
		Vertex vertex7 = new Vertex(7,"t");
        
		List<Vertex> vertexList = new ArrayList<>();
		vertexList.add(vertex0);
		vertexList.add(vertex1);
		vertexList.add(vertex2);
		vertexList.add(vertex3);
		vertexList.add(vertex4);
		vertexList.add(vertex5);
		vertexList.add(vertex6);
		vertexList.add(vertex7);
		
        //Add edges
		graph.addEdge(new Edge(vertex0,vertex1,10));
		graph.addEdge(new Edge(vertex0,vertex3,5));
		graph.addEdge(new Edge(vertex0,vertex5,15));

		graph.addEdge(new Edge(vertex1,vertex2,9));
		graph.addEdge(new Edge(vertex1,vertex3,4));
		graph.addEdge(new Edge(vertex1,vertex4,15));		
		
		graph.addEdge(new Edge(vertex2,vertex4,15));
		graph.addEdge(new Edge(vertex2,vertex7,10));
	    
		graph.addEdge(new Edge(vertex3,vertex4,8));
		graph.addEdge(new Edge(vertex3,vertex5,4));
		
		graph.addEdge(new Edge(vertex4,vertex6,15));
		graph.addEdge(new Edge(vertex4,vertex7,10));
		
		graph.addEdge(new Edge(vertex5,vertex6,16));
		
		graph.addEdge(new Edge(vertex6,vertex3,6));
		graph.addEdge(new Edge(vertex6,vertex7,10));
		
		FordFulkerson ff = new FordFulkerson(graph, vertex0, vertex7);
		
                
		ff.runEdmondsKarp();
		
		System.out.println( "Maximum flow: " + ff.getValue()); //Maximum flow 
		
		System.out.println("Vertices in the min cut set: " );
		for(int v=0;v<vertexList.size(); v++){
			if(ff.isInCut(v))
				System.out.println(vertexList.get(v)); // Vertices in min cut
		}
	}
}
