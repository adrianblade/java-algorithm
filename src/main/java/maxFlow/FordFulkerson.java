package maxFlow;

import java.util.LinkedList;
import java.util.Queue;

public class FordFulkerson {

    private boolean[] hasPathInResidualGraph; //true if s->v path in residual path
	private Edge[] lastEdgeOnShortestResidualPath; 
	//lastEdgeOnShortestResidualPath[v] = last edge on the shortest residual  s->v path
	
	private double valueMaxFlow; //current value of maximum flow;
	private Graph graph; //Reference to graph
	private Vertex s; //Source
	private Vertex t; //Target

    public FordFulkerson(Graph graph, Vertex s, Vertex t) {
       
        this.graph = graph;
		this.s = s;
		this.t = t;
    }
   
    //Edmond Karps algo to find max flow using BFS
    public void runEdmondsKarp() { 
    	while(hasAugmentingPath()){
			
		double bottleneckCapacity = Double.POSITIVE_INFINITY;
		
		//finding the minimum capacity on the augmenting path
		for (Vertex v = t; v != s; v = lastEdgeOnShortestResidualPath[v.getId()].getOtherVertex(v))
		{
			bottleneckCapacity = Math.min(bottleneckCapacity, 
				lastEdgeOnShortestResidualPath[v.getId()].getResidualCapacityTo(v));
		}
		
		//adding residual df flow to the system
		for (Vertex v = t; v != s; v = lastEdgeOnShortestResidualPath[v.getId()].getOtherVertex(v))
		{
			lastEdgeOnShortestResidualPath[v.getId()].addResidualFlowTo(v,bottleneckCapacity);
		}
		
		//increment flow accordingly
		valueMaxFlow += bottleneckCapacity;
			
	}
    }

	//Detect if the vertex is in the minimal cut
    public boolean isInCut(int index) {
        return this.hasPathInResidualGraph[index];
    }

	//Get the maximum flow
	public double getValue() { 
		return valueMaxFlow;
	}
	
	//BFS algorithm to find the augmenting paths
    public boolean hasAugmentingPath(){
		
		lastEdgeOnShortestResidualPath = new Edge[graph.getNumOfVertices()];
		hasPathInResidualGraph = new boolean[graph.getNumOfVertices()];
		
		Queue<Vertex> queue = new LinkedList<Vertex>();
		queue.add(s);
		hasPathInResidualGraph[s.getId()] = true;
		
		while(!queue.isEmpty() && !hasPathInResidualGraph[t.getId()]){
			Vertex v = queue.remove();
			
			for (Edge e  : graph.getNeighbours(v)){
				Vertex w = e.getOtherVertex(v);
				
				if(e.getResidualCapacityTo(w) > 0){
					if(!hasPathInResidualGraph[w.getId()]){
						lastEdgeOnShortestResidualPath[w.getId()] = e;
						hasPathInResidualGraph[w.getId()] = true;
						queue.add(w);
					}
				}
			}
		}
		
		return hasPathInResidualGraph[t.getId()];
	} 
}
