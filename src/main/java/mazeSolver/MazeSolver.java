package mazeSolver;

/**
 * Created by Adrian on 10/06/2017.
 */
public class MazeSolver {
    private int[][] mazeMap;
    private boolean[][] visited;
    private int startPositionCol;
    private int startPositionRow;

    public MazeSolver(int[][] mazeMap, int startPositionCol, int startPositionRow) {
        this.mazeMap = mazeMap;
        this.visited = new boolean[mazeMap.length][mazeMap.length];
        this.startPositionCol = startPositionCol;
        this.startPositionRow = startPositionRow;
    }


    /**
     * Find way
     */
    public void findWayOut() {
        try {
            dfs(startPositionRow, startPositionCol + 1);
            System.out.println("No solution found...");
        } catch (RuntimeException e){
            System.out.println("ROUTE FOUND TO EXIT!!!");
        }
    }

    /**
     * Find correct route
     * @param i
     * @param j
     */
    private void dfs(int i, int j) {
        System.out.println("Visiting i = "+i+" j= "+j);

        if (this.mazeMap[i][j] == 3) {
            //EXIT FOUND
            throw new RuntimeException();
        }

        int endOfMap = this.mazeMap.length - 1;

        if(visited[i][j]) {
            // position visited
            return;
        } else if (i < 0 || i >= endOfMap) {
            //Out of map
            return;
        } else if (j < 0 || j >= endOfMap) {
            //Out of map
            return;
        } else if (this.mazeMap[i][j] == 1) {
            // Route not valid.
            return;
        } else {
            // Route valid.
            this.visited[i][j] = true;

            dfs(i+1,j); //  DOWN
            dfs(i,j+1); // RIGHT
            dfs(i,j-1); // LEFT
            dfs(i-1,j); // UP

        }
    }
}
