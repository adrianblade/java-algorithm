package kosaraju;

public class KosarajuAlgorithm {

    private int[] id;             // id[v] = id of strong component containing v
    private int count;            // number of strongly-connected components
    private boolean[] marked;

    public KosarajuAlgorithm(Graph G) {
       
        DepthFirstOrder dfs = new DepthFirstOrder(G.getTransposeGraph());

        marked = new boolean[G.getVertexList().size()];
        id = new int[G.getVertexList().size()];
        
        for (Vertex vertex : dfs.getReversePost()) {   
            if (!marked[vertex.getId()]) {
                dfs(vertex);
                count++;
            }
        }
    }
   
    private void dfs(Vertex vertex) { 
    	marked[vertex.getId()] = true;
        id[vertex.getId()] = count;
        vertex.setComponentId(count);
        for (Vertex v : vertex.getAdjaenciesList()) {
            if (!marked[v.getId()]) 
            	dfs(v);
        }
    }

    public int count() { return count; }

    public boolean stronglyConnected(int v, int w) {
        return id[v] == id[w];
    }

    public int id(int v) {
        return id[v];
    } 
}
