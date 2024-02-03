import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        //System.out.println(countPath(3, 3));
        showPaths(3, 3, "");
        //System.out.println(showPathsList(3, 3, ""));
        //System.out.println(showPathsListDiagonal(3, 3, ""));
    }

    static int countPath(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;// means one path found
        }
        int totalPaths = 0;
        int downPath = countPath(row - 1, col);
        int rightPath = countPath(row, col - 1);
        totalPaths = downPath + rightPath;
        return totalPaths;
    }

    static void showPaths(int row, int col, String paths) {
        // this is the base condition to return the paths
        if (row == 1 && col == 1) {
            System.out.println(paths);
            return;// means you have reached the last position
        }
        if (row > 1) {
            showPaths(row - 1, col, paths + "D");
        }
        if (col > 1) {
            showPaths(row, col - 1, paths + "R");
        }
        System.out.printf("returning to [%d,%d]", row, col);
    }

    static ArrayList<String> showPathsList(int row, int col, String paths) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(paths);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (row > 1) {
            ArrayList<String> downPath = showPathsList(row - 1, col, paths + "D");
            ans.addAll(downPath);
        }
        if (col > 1) {
            ArrayList<String> rightPath = showPathsList(row, col - 1, paths + "R");
            ans.addAll(rightPath);
        }

        return ans;
    }

    static ArrayList<String> showPathsListDiagonal(int row, int col, String paths) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(paths);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if (row > 1) {
            ArrayList<String> downPath = showPathsListDiagonal(row - 1, col, paths + "D");
            ans.addAll(downPath);
        }
        if (col > 1) {
            ArrayList<String> rightPath = showPathsListDiagonal(row, col - 1, paths + "R");
            ans.addAll(rightPath);
        }

        if (row > 1 && col > 1) {
            ArrayList<String> rightPath = showPathsListDiagonal(row - 1, col - 1, paths + "L");
            ans.addAll(rightPath);
        }

        return ans;
    }
}