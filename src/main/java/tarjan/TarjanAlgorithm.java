package tarjan;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TarjanAlgorithm {

	private Stack<Vertex> stack;
	private List<Vertex> vertexList;
	private List<List<Vertex>> connectedComponentList;
	private int time = 0;
	
	public TarjanAlgorithm(List<Vertex> vertexList){
		this.stack = new Stack<>();
		this.vertexList = vertexList;
		this.connectedComponentList = new ArrayList<>();
	}
	
	public void runAlgorithm() {	
		for(Vertex vertex : vertexList){
			if( !vertex.isVisited() ){
				dfs(vertex);
			}
		}
	}
	
	private void dfs(Vertex vertex){
		
		vertex.setLowLink(time++);
		vertex.setVisited(true);
		this.stack.add(vertex);
		boolean isComponentRoot = true;
		
		for(Vertex v : vertex.getNeighbourList()){
			
			if(!v.isVisited()){
				dfs(v);
			}
			
			if( vertex.getLowLink() > v.getLowLink() ){
				vertex.setLowLink(v.getLowLink());
				isComponentRoot = false;
			}
		}
		
		if( isComponentRoot ){
			
			List<Vertex> component = new ArrayList<>();
			
			while(true){
				Vertex actualVertex = stack.pop();
				component.add(actualVertex);
				actualVertex.setLowLink(Integer.MAX_VALUE);
				
				if( actualVertex.getName().equals(vertex.getName()) ) break;
			}
			
			connectedComponentList.add(component);
		}
	}
	
	public void printComponents(){
		System.out.println(connectedComponentList);
	}
}
