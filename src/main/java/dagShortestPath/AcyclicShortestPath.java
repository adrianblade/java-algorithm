package dagShortestPath;

import java.util.List;
import java.util.Stack;

public class AcyclicShortestPath {

	public void shortestPath(List<Vertex> vertexList, Vertex sourceVertex, Vertex targetVertex){
		
		sourceVertex.setMinDistance(0);
		TopologicalSort topologicalSort = new TopologicalSort();
		
		//Make TopologicalOrder on the vertex list
		topologicalSort.makeTopologicalOrder(vertexList);
		
		//Topological Order is returned as a Stack
		Stack<Vertex> stack = topologicalSort.getTopologicalOrder();
			
		//Iterate through the Stack	to find the min distance
		for(Vertex actualVertex : stack){
		
		
			//Print out all the traversed vertices
			System.out.print("Traversed vertices:" + actualVertex+" ");
			System.out.print("\n");
			
			for(Edge edge : actualVertex.getAdjacenciesList()){
				
				Vertex u = edge.getStartVertex();
				Vertex v = edge.getTargetVertex();
				
				double newDistance = u.getMinDistance() + edge.getWeight();
				
				if( newDistance < v.getMinDistance() ){
					v.setMinDistance(newDistance);
					v.setPredecessor(u);
				}						
			}	
		}
		
		//Print the shortest path
		if( targetVertex.getMinDistance() == Double.MAX_VALUE){
			System.out.println("No shortest path there...");
		}else{
			System.out.println("Target vertex shortest path: "+targetVertex.getMinDistance());
		}
		
	}
}
