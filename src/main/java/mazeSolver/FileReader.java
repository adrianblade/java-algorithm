package mazeSolver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Adrian on 10/06/2017.
 */
public class FileReader {
    private int[][] map;
    private String fileName;
    private int numOfRows;
    private int numOfColums;
    private int startPositionCol;
    private int startPositionRow;

    public FileReader(String fileName, int numOfRows, int numOfColums) {
        this.fileName = fileName;
        this.numOfRows = numOfRows;
        this.numOfColums = numOfColums;
        this.map = new int[numOfRows][numOfColums];
    }

    /**
     * Parse file with routes
     */
    public void parseFile() {

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(this.fileName));

            for (int i = 0; i < this.numOfRows; i++) {
                for (int j = 0; j < this.numOfColums; j++) {
                    map[i][j] = scanner.nextInt();
                    if (map[i][j] == 2) {
                        startPositionCol = j;
                        startPositionRow = i;

                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int[][] getMap() {
        return map;
    }

    public int getStartPositionCol() {
        return startPositionCol;
    }

    public int getStartPositionRow() {
        return startPositionRow;
    }
}


