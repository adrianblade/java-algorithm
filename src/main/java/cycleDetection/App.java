package cycleDetection;

import common.Vertex;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian on 10/06/2017.
 */
public class App {

    /**
     * Cycle detection Main
     * @param args
     */
    public static void main (String[] args) {
        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");


        vertexA.addNeighbour(vertexB);
        vertexB.addNeighbour(vertexC);
        vertexC.addNeighbour(vertexA);



        List<Vertex> vertexList = new ArrayList<Vertex>();
        vertexList.add(vertexA);
        vertexList.add(vertexB);
        vertexList.add(vertexC);

        CycleDetection cycleDetection = new CycleDetection();
        cycleDetection.detectCycles(vertexList);
    }
}
