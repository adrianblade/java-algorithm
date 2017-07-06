package aStar;

import java.util.ArrayList;
import java.util.List;

public class Node implements Comparable<Node>{

    private String value;
    private double gScore;
    private double fScore;
    private double x;
    private double y;
    private List<Edge> adjacenciesList;
    private Node parentNode;

    public Node(String value) {
        this.value = value;
        this.adjacenciesList = new ArrayList<>();
    }

    public void addNeighbour(Edge edge){
        this.adjacenciesList.add(edge);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public double getgScore() {
        return gScore;
    }

    public void setgScore(double gScore) {
        this.gScore = gScore;
    }

    public double getfScore() {
        return fScore;
    }

    public void setfScore(double fScore) {
        this.fScore = fScore;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public List<Edge> getAdjacenciesList() {
        return adjacenciesList;
    }

    public Node getParentNode() {
        return parentNode;
    }

    public void setParentNode(Node parentNode) {
        this.parentNode = parentNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public int compareTo(Node otherNode) {
        return Double.compare(this.fScore, otherNode.getfScore() );
    }
}
