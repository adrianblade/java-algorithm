package kosaraju;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

	private int id;
	private String name;
	private boolean visited;
	private List<Vertex> adjaenciesList;
	private int componentId;
	
	public Vertex(int id, String name){
		this.id = id;
		this.name = name;
		this.adjaenciesList = new ArrayList<>();
	}

	public int getId(){
		return this.id;
	}
	
	public int getComponentId() {
		return componentId;
	}

	public void setComponentId(int componentId) {
		this.componentId = componentId;
	}

	public String getName(){
		return this.name;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	public void addNeighbour(Vertex vertex){
		this.adjaenciesList.add(vertex);
	}

	public List<Vertex> getAdjaenciesList() {
		return adjaenciesList;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
