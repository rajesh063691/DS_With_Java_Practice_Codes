public class MazeWithHuddle {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };

        mazeWithHuddle(0, 0, maze, "");
    }

    static void mazeWithHuddle(int row, int col, boolean[][] maze, String paths) {
        // this is the base condition to return the paths
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(paths);
            return;// means you have reached the last position
        }
        // if hurdle position found then simply return bcz can not cross the huddle.
        if (!maze[row][col]) {
            return;
        }

        if (row < maze.length - 1) {
            mazeWithHuddle(row + 1, col, maze, paths + "D");
        }
        if (col < maze[0].length - 1) {
            mazeWithHuddle(row, col + 1, maze, paths + "R");
        }

    }
}
