package dagShortestPath;

import java.util.ArrayList;
import java.util.List;

public class Main{

	public static void main(String[] args) {
		
		Vertex vertex0 = new Vertex("r");
		Vertex vertex1 = new Vertex("t");
		Vertex vertex2 = new Vertex("x");
		Vertex vertex3 = new Vertex("s");
		Vertex vertex4 = new Vertex("y");
		Vertex vertex5 = new Vertex("z");
		
		List<Vertex> vertexList = new ArrayList<>();
		vertexList.add(vertex0);
		vertexList.add(vertex1);
		vertexList.add(vertex2);
		vertexList.add(vertex3);
		vertexList.add(vertex4);
		vertexList.add(vertex5);
		
		vertex0.addNeighbour(new Edge(3, vertex0, vertex1));
		vertex0.addNeighbour(new Edge(5, vertex0, vertex3));
		
		vertex1.addNeighbour(new Edge(7, vertex1, vertex2));
		vertex1.addNeighbour(new Edge(4, vertex1, vertex4));
		vertex1.addNeighbour(new Edge(2, vertex1, vertex5));
		
		vertex2.addNeighbour(new Edge(-1, vertex2, vertex4));
		vertex2.addNeighbour(new Edge(1, vertex2, vertex5));
		
		vertex3.addNeighbour(new Edge(6, vertex3, vertex2));
		
		vertex4.addNeighbour(new Edge(-2, vertex4, vertex5));
		
		AcyclicShortestPath acyclicShortestPath = new AcyclicShortestPath();
		acyclicShortestPath.shortestPath(vertexList, vertex3, vertex0);

	}
}
