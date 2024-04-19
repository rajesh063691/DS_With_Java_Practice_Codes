public class SegmentMain {
    public static void main(String[] args) {
        int[] arr = {3, 8, 7, 6, -2, -8, 4, 9};
        SegmentTree segTree = new SegmentTree();
        segTree.constructTree(arr);
        segTree.display();
        System.out.println(segTree.query(3, 4));
    }
}
