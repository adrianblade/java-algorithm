 package arbitrageDetection;

import java.util.ArrayList;
import java.util.List;

public class BellmanFord {

	private List<Vertex> vertexList;
	private List<Edge> edgeList;
	private List<Vertex> cycleList;

	public BellmanFord(List<Vertex> vertexList, List<Edge> edgeList) {
		this.vertexList = vertexList;
		this.edgeList = edgeList;
		this.cycleList = new ArrayList<Vertex>();
	}

	public void bellmanFord(Vertex sourceVertex) {

		sourceVertex.setMinDistance(0);

		for (Vertex vertex : vertexList) {
			for (Edge edge : edgeList) {

				if (edge.getStartVertex().getMinDistance() == Integer.MAX_VALUE) {
					continue;
				}

				double newDistance = edge.getStartVertex().getMinDistance() + edge.getWeight();

				if (newDistance < edge.getTargetVertex().getMinDistance()) {
					edge.getTargetVertex().setMinDistance(newDistance);
					edge.getTargetVertex().setPreviousVertex(edge.getStartVertex());
				}
			}
		}

		for (Edge edge : edgeList) {
			if (edge.getStartVertex().getMinDistance() != Integer.MAX_VALUE) {
				if ( hasCycle(edge) ) {				
					
					Vertex vertex = edge.getStartVertex();
					
					while( !vertex.equals(edge.getTargetVertex())){
						this.cycleList.add(vertex);
						vertex = vertex.getPreviousVertex();
					}
					
					this.cycleList.add(edge.getTargetVertex());
					
					return;
				}
			}
		}
	}
	
	private boolean hasCycle(Edge edge){
		return edge.getTargetVertex().getMinDistance() > edge.getStartVertex().getMinDistance() + edge.getWeight();
	}
	
	public void printCycle(){
		if( this.cycleList != null ){
			for(Vertex vertex : this.cycleList){
				System.out.println(vertex);
			}
		}else{
			System.out.println("No arbitrage opportunity...");
		}
	}
}
