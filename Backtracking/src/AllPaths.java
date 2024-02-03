import java.util.ArrayList;
import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {{true, true, true}, {true, true, true}, {true, true, true},};
        int[][] path = new int[3][3];
        //mazeAllPaths(0, 0, maze, "");
        mazeAllPathsPrint(0, 0, maze, "", path, 1);
    }
    //DEBUG AND CHECK HOW THINGS ARE WORKING

    static void mazeAllPaths(int row, int col, boolean[][] maze, String paths) {
        // this is the base condition to return the paths
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(paths);
            return;// means you have reached the last position
        }
        // if hurdle position found then simply return bcz can not cross the huddle.
        if (!maze[row][col]) {
            return;
        }

        // consider this current call is on progress. So, to avoid infiite recursion mark the visited cell to false
        maze[row][col] = false;

        if (row < maze.length - 1) {
            mazeAllPaths(row + 1, col, maze, paths + "D");
        }
        if (col < maze[0].length - 1) {
            mazeAllPaths(row, col + 1, maze, paths + "R");
        }
        if (row > 0) {
            mazeAllPaths(row - 1, col, maze, paths + "U");
        }
        if (col > 0) {
            mazeAllPaths(row, col - 1, maze, paths + "L");
        }

        // now before returning from the current cell, revert the changes you made earlier.
        // so it would be available for others to be visited.
        maze[row][col] = true;
    }


    static void mazeAllPathsPrint(int row, int col, boolean[][] maze, String paths, int[][] path, int steps) {
        // this is the base condition to return the paths
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = steps;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(paths);
            System.out.println();
            path[row][col] = 0; // just resetting the last returned cell value
            return;// means you have reached the last position
        }
        // if hurdle position found then simply return bcz can not cross the huddle.
        if (!maze[row][col]) {
            return;
        }

        // consider this current call is on progress. So, to avoid infiite recursion mark the visited cell to false
        maze[row][col] = false;
        path[row][col] = steps;

        if (row < maze.length - 1) {
            mazeAllPathsPrint(row + 1, col, maze, paths + "D", path, steps + 1);
        }
        if (col < maze[0].length - 1) {
            mazeAllPathsPrint(row, col + 1, maze, paths + "R", path, steps + 1);
        }
        if (row > 0) {
            mazeAllPathsPrint(row - 1, col, maze, paths + "U", path, steps + 1);
        }
        if (col > 0) {
            mazeAllPathsPrint(row, col - 1, maze, paths + "L", path, steps + 1);
        }

        // now before returning from the current cell, revert the changes you made earlier.
        // so it would be available for others to be visited.
        maze[row][col] = true;
        path[row][col] = 0; // back track to det it to 0 again
    }
}