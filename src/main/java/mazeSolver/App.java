package mazeSolver;


/**
 * Created by Adrian on 10/06/2017.
 */
public class App {

    /**
     * Maze solver Main
     * @param args
     */
    public static void main (String[] args) {
        FileReader fileReader = new FileReader("C:\\Users\\Adrian\\IdeaProjects\\algorithm\\src\\main\\java\\mazeSolver\\map.txt",4, 4);
        fileReader.parseFile();
        MazeSolver mazeSolver = new MazeSolver(fileReader.getMap(),fileReader.getStartPositionRow(), fileReader.getStartPositionCol());
        mazeSolver.findWayOut();
    }
}
