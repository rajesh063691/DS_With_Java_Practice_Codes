public class AVLMain {
    public static void main(String[] args) {
        AVLTree avl = new AVLTree();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("is Tree Empty :: " + avl.isEmpty());
        for (int i = 0; i < 1000; i++) {
            avl.populate(i);
        }
        avl.display();

        //System.out.println("Is Tree Balanced: " + avl.getHeight());
    }
}
