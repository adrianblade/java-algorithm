package dagShortestPath;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private String name;
	private Vertex predecessor;
	private boolean visited;
	private List<Edge> adjacenciesList;
	private double minDistance = Double.MAX_VALUE; //Min dist initialized to a large value
	
	//Constructor
	public Vertex(String name){
		this.name = name;
		this.adjacenciesList = new ArrayList<Edge>();
	}
	
	//Add  edges to the adjacencies list
	public void addNeighbour(Edge edge){
		this.adjacenciesList.add(edge);
	}
	
	//Getter and Setters
	
	public Vertex getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public double getMinDistance() {
		return minDistance;
	}

	public void setMinDistance(double minDistance) {
		this.minDistance = minDistance;
	}

	public List<Edge> getAdjacenciesList() {
		return adjacenciesList;
	}

	//Override toString method to return the name of the vertex
	@Override
	public String toString() {
		return this.name;
	}
}
