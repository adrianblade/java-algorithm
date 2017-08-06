package maxFlow;

public class Edge {

	private Vertex startVertex;
	private Vertex targetVertex;
	private double capacity;
	private double flow;
	
	//Constructor
	public Edge(Vertex startVertex, Vertex targetVertex, double capacity) {
		this.startVertex = startVertex;
		this.targetVertex = targetVertex;
		this.capacity = capacity;
	}

	//Getters and Setters
	public Vertex getStartVertex() {
		return startVertex;
	}
	
	public Vertex getTargetVertex() {
		return targetVertex;
	}

	public double capacity() {
		return capacity;
	}
	
	public double getFlow() {
		return flow;
	}

	//Get the other vertex
	public Vertex getOtherVertex(Vertex vertex) {
		if(vertex.equals(startVertex)){
			return targetVertex;
		}else{
			return startVertex;
		}
	}
	
	//Decide for backward or forward edge
	//backward edge - return flow
	//forward edge - return capacity - flow
	public double getResidualCapacityTo(Vertex vertex) {
		if(vertex.equals(startVertex)){
			return flow; //backward edge
		}else{
			return capacity - flow; //forward edge
		}
	}
	
	//add the deltaFlow to the vertex and then decide backward or forward edge
	//backward edge - subtract from flow
	//forward edge - add to flow
	public void addResidualFlowTo(Vertex vertex, double deltaFlow) {
		if(vertex.equals(startVertex)){
			flow -= deltaFlow; //backward edge
		}else{
			flow += deltaFlow; //forward edge
		}
	}
	
	@Override
	public String toString() {
		return startVertex + " -> "+ targetVertex +" "+flow + "/" + capacity;
	}

}
