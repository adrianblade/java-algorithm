package bfs.webCrawler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian on 04/06/2017.
 */
public class Vertex {
    private int name;
    private boolean visited;
    private Vertex previousVertex;
    private List<Vertex> adjacenciesList;

    public Vertex(int name) {
        this.name = name;
        this.adjacenciesList = new ArrayList<Vertex>();
    }

    public void addNeighbour(Vertex vertex) {
        this.adjacenciesList.add(vertex);
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Vertex getPreviousVertex() {
        return previousVertex;
    }

    public void setPreviousVertex(Vertex previousVertex) {
        this.previousVertex = previousVertex;
    }

    public List<Vertex> getAdjacenciesList() {
        return adjacenciesList;
    }

    public void setAdjacenciesList(List<Vertex> adjacenciesList) {
        this.adjacenciesList = adjacenciesList;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "name=" + name +
                '}';
    }
}

