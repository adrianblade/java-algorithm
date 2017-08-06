package primsAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Vertex> vertexList = new ArrayList<>();
		
		Vertex vertex0 = new Vertex("A");
		Vertex vertex1 = new Vertex("B");
		Vertex vertex2 = new Vertex("C");
		
		vertexList.add(vertex0);
		vertexList.add(vertex1);
		vertexList.add(vertex2);
		
		vertex0.addEdge(new Edge(vertex0, vertex1, 1));	
		vertex0.addEdge(new Edge(vertex0, vertex2, 1));	
		vertex1.addEdge(new Edge(vertex1, vertex2, 10));
		
		vertex1.addEdge(new Edge(vertex1, vertex0, 1));	
		vertex2.addEdge(new Edge(vertex2, vertex0, 1));	
		vertex2.addEdge(new Edge(vertex2, vertex1, 10));
		
		
		Algorithm algorithm = new Algorithm(vertexList);
		
		algorithm.primsAlgorithm(vertex2);
		
	}
}
