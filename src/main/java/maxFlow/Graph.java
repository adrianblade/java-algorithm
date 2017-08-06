package maxFlow;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	private int numOfVertices;
	private int numOfEdges;
	private List<List<Edge>> neighbourList;
	
	//Constructor
	public Graph(int numOfVertices) {
		this.numOfVertices = numOfVertices;
		this.numOfEdges = 0;
		this.neighbourList = new ArrayList<>(numOfVertices);
		
		for(int i = 0; i<numOfVertices;i++){
			List<Edge> edgeList = new ArrayList<>();
			neighbourList.add(edgeList);
		}
	}
	
	//Getters and Setters
	
	public int getNumOfVertices(){
		return this.numOfVertices;
	}

	public int getNumOfEdges(){
		return this.numOfEdges;
	}
	
	//Add the edges to construct the residual graph
	public void addEdge(Edge edge){
		Vertex v = edge.getStartVertex();
		Vertex w = edge.getTargetVertex();
		neighbourList.get(v.getId()).add(edge);
		neighbourList.get(w.getId()).add(edge);
		numOfEdges++;
	}
	
	public List<Edge> getNeighbours(Vertex v) {
		return neighbourList.get(v.getId());
	}

}
