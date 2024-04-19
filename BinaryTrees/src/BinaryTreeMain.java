import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryTreeMain {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.populate(new Scanner(System.in));

        tree.display();
        // print the tree level wise - BFS(Breast First Search)

    }
}
