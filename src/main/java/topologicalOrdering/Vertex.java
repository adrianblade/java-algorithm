package topologicalOrdering;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian on 04/06/2017.
 */
public class Vertex {
    private String data;
    private boolean visited;
    private List<Vertex> adjacenciesList;

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

    @Override
    public String toString() {
        return data;
    }
}


