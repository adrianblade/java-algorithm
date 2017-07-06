package aStar;

import java.util.*;

public class Algorithm {

    // We store the explored nodes in a Set Data Structure
    Set<Node> exploredNodes = new HashSet<>();

    public void aStarSearchAlgo(Node sourceNode, Node goalNode){

        // We use a PriorityQueue to implement A* Search
        // We keep adding nodes and its neighbours to the unexploredNodesQueue
        // We use the PriorityQueue along with the heap to find the minimum element in a time complexity of O(1) + O(log(N)) = O(log(N))
        PriorityQueue<Node> unexploredNodesQueue = new PriorityQueue<>();
        sourceNode.setgScore(0); //gScore is same as the min distance
        unexploredNodesQueue.add(sourceNode);
        boolean isFound = false;

        // Loop until goalNode is Found or the PriorityQueue is empty
        while(!unexploredNodesQueue.isEmpty() && !isFound){

            Node currentNode = unexploredNodesQueue.poll();
            exploredNodes.add(currentNode);

            //If goalNode is found
            if(currentNode.getValue().equals(goalNode.getValue())){
                isFound = true;
            }

            //Iterate through the edges
            //Visit all neighbours and add them to visited.
            for(Edge e: currentNode.getAdjacenciesList()){
                Node childNode = e.getTargetNode();
                double cost = e.getCost(); // cost of the edge
                double tempGScore = currentNode.getfScore() + cost;
                //A*Search f(x) = g(x) + h(x)
                double tempFScore = tempGScore + heuristic(childNode,goalNode); // Here the manhattan distance is used to calculate the tempFScore

                //Check is there is any better node
                if (exploredNodes.contains(childNode) && tempFScore >= childNode.getfScore()){
                    continue;
                }
                else if(!exploredNodes.contains(childNode) || tempFScore <= childNode.getfScore()){
                    childNode.setParentNode(currentNode);
                    childNode.setgScore(tempGScore);
                    childNode.setfScore(tempFScore);

                    if(unexploredNodesQueue.contains(childNode)){
                        unexploredNodesQueue.remove(childNode);
                    }

                    unexploredNodesQueue.add(childNode);
                }
            }
        }
    }

    public List<Node> printPath(Node targetNode){

        List<Node> pathList = new ArrayList<>();
        // Backtrack to the starting node
        for(Node node = targetNode; node!=null; node = node.getParentNode()){
            pathList.add(node);
        }

        Collections.reverse(pathList);

        return pathList;

    }

    //

    /**
     * Manhattan heuristic function to calculated the estimated distance from goal node to current node
     * ABS(X - X') + ABS(Y - Y')
     * @param node1
     * @param node2
     * @return
     */
    private double heuristic(Node node1, Node node2) {
        return Math.abs(node1.getX() - node2.getX()) + Math.abs(node1.getY()- node2.getY());
    }
}
