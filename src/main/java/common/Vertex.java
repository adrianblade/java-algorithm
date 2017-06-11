package common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian on 08/06/2017.
 */
public class Vertex {
    private String data;
    private boolean visited;
    private List<Vertex> adjacenciesList;

    //PREDECESOR
    private Vertex precedessor;

    //BEING_VISITED
    private boolean beingVisited;

    //CONSTRUCTORS


    public Vertex() {
    }

    public Vertex(String data) {
        this.data = data;
        this.adjacenciesList = new ArrayList<Vertex>();
    }

    public void addNeighbour(Vertex vertex) {
        this.adjacenciesList.add(vertex);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getAdjacenciesList() {
        return adjacenciesList;
    }

    public void setAdjacenciesList(List<Vertex> adjacenciesList) {
        this.adjacenciesList = adjacenciesList;
    }

    public Vertex getPrecedessor() {
        return precedessor;
    }

    public void setPrecedessor(Vertex precedessor) {
        this.precedessor = precedessor;
    }

    public boolean isBeingVisited() {
        return beingVisited;
    }

    public void setBeingVisited(boolean beingVisited) {
        this.beingVisited = beingVisited;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "data='" + data + '\'' +
                '}';
    }
}
