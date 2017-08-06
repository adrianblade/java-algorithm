package maxFlow;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ANIRUDDHA
 */

public class Vertex {
 
	private int id; 
	private String name; //The name
	private boolean visited; //Visited vertices
	
	//Constructor
	public Vertex(int id,String name){
		this.id=id;
		this.name=name;
	}

	//Getters and Setters

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	public int getId(){
		return this.id;
	}

	//Override the toString method to return the name&id of the traversed vertices
	@Override
	public String toString() {
		return ""+this.name+"-"+this.id;
	}
}
