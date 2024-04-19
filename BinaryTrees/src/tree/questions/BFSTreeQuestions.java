package tree.questions;

import java.util.*;


public class BFSTreeQuestions {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public static void main(String[] args) {

    }

    // https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int nodeLevel = queue.size();
            double averageLeval = 0;
            for (int i = 0; i < nodeLevel; i++) {
                TreeNode current = queue.poll();
                averageLeval += current.val;
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            // finding the average
            averageLeval = averageLeval / nodeLevel;
            result.add(averageLeval);
        }

        return result;
    }

    // find the next successor
    private TreeNode findSuccessor(TreeNode root, int key) {
        List<Double> result = new ArrayList<>();
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
            if (current.val == key) {
                break;
            }
        }

        return queue.peek();
    }


    // https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        boolean removeFirstAddLast = true;

        while (!queue.isEmpty()) {
            int curreltLevel = queue.size();
            List<Integer> current = new ArrayList<>();
            TreeNode currentNode = null;
            for (int i = 0; i < curreltLevel; i++) {
                if (removeFirstAddLast) {

                    currentNode = queue.removeFirst();

                    if (currentNode.left != null) {
                        queue.addLast(currentNode.left);
                    }

                    if (currentNode.right != null) {
                        queue.addLast(currentNode.right);
                    }

                } else {
                    // remove from back and add in front
                    currentNode = queue.removeLast();
                    if (currentNode.right != null) {
                        queue.addFirst(currentNode.right);
                    }

                    if (currentNode.left != null) {
                        queue.addFirst(currentNode.left);
                    }

                }
                current.add(currentNode.val);

            }

            result.add(current);
            removeFirstAddLast = !removeFirstAddLast;
        }

        return result;
    }

    // https://leetcode.com/problems/binary-tree-right-side-view/description/
    // solution: for each level - just take the right most node i.e pick the last element in the queue
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int level = queue.size();
            TreeNode current = queue.poll();
            for (int i = 0; i < level; i++) {
                if (i == level - 1) {
                    // last element in the queue
                    result.add(current.val);
                }
                // now add the left and right node in the queue
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }


        }
        return result;
    }

    // https://leetcode.com/problems/cousins-in-binary-tree/description/
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);

        return ((level(root, xx, 0) == level(root, yy, 0)) && (!isSiblings(root, xx, yy)));
    }

    private TreeNode findNode(TreeNode node, int x) {
        if (node == null) {
            return null;
        }

        if (node.val == x) {
            return node;
        }

        TreeNode left = findNode(node.left, x);
        if (left != null) {
            return left;
        }
        return findNode(node.right, x);

    }


    private boolean isSiblings(TreeNode node, TreeNode x, TreeNode y) {
        if (node == null) {
            return false;
        }

        return ((node.left == x && node.right == y) || (node.left == y && node.right == x) || isSiblings(node.left, x, y) || isSiblings(node.right, x, y));
    }


    private int level(TreeNode node, TreeNode x, int lev) {
        if (node == null) {
            return 0;
        }

        if (x == node) {
            return lev;
        }

        int l = level(node.left, x, lev + 1);
        if (l != 0) {
            return l;
        }

        int r = level(node.right, x, lev + 1);

        return r;
    }


    //  https://leetcode.com/problems/symmetric-tree/description/
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);

        while (!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            // check if both left and right is nill the skip
            if (left == null && right == null) {
                continue;
            }
            // check if left or right anyone is null then return false - bcoz if left and right is  ull then it cannot be symmetric
            if (left == null || right == null) {
                return false;
            }
            // check if the value is same else return false
            if (left.val != right.val) {
                return false;
            }
            // finally, add in the order left.left, right.right, left.right, right.left
            queue.offer(left.left);
            queue.offer(right.right);
            queue.offer(left.right);
            queue.offer(right.left);
        }

        return true;
    }

    // https://leetcode.com/problems/diameter-of-binary-tree/
    public int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter - 1;
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int dia = leftHeight + rightHeight + 1;
        diameter = Math.max(diameter, dia);


        return Math.max(leftHeight, rightHeight) + 1;
    }

    // https://leetcode.com/problems/invert-binary-tree/
    public TreeNode invertTree(TreeNode root) {
        return invertBTree(root);
    }

    private TreeNode invertBTree(TreeNode node) {
        if (node == null) {
            return node;
        }

        TreeNode left = invertBTree(node.left);
        TreeNode right = invertBTree(node.right);

        node.left = right;
        node.right = left;

        return node;
    }

    // https://leetcode.com/problems/maximum-depth-of-binary-tree/
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
//    public TreeNode sortedArrayToBST(int[] nums) {
//
//        return sortedArrToBST(nums, 0, nums.length);
//    }
//
//    private TreeNode sortedArrToBST(int[] nums, int start, int end) {
//        if (start > end) {
//            return null;
//        }
//        int mid = start + (end - start) / 2;
//        TreeNode node = insertInBST(nums[mid]);
//
//    }
//
//    private TreeNode insertInBST(int val) {
//        TreeNode node = new TreeNode(val);
//
//    }
    // approach 1
    // https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
    public void flatten1(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue = PopulateQueue(root, queue);
        // take from queue and make new Tree
        TreeNode temp = new TreeNode();
        TreeNode newRoot = new TreeNode();
        while (!queue.isEmpty()) {
            TreeNode local = queue.poll();
            // check if temp is null then make the first queued item as temp else append to the right of temp
            if (temp == null) {
                temp = local;
                newRoot = temp;
            } else {
                temp.left = null;
                temp.right = local;
                temp = temp.right;
            }
        }
        root = newRoot;
    }

    private Queue<TreeNode> PopulateQueue(TreeNode node, Queue<TreeNode> queue) {
        if (node == null) {
            return queue;
        }
        queue.offer(node);
        PopulateQueue(node.left, queue);
        PopulateQueue(node.right, queue);

        return queue;
    }

    // approach 2
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode current = root;
        while (current != null) {
            if (current.left != null) {
                TreeNode temp = current.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                // assign left rightmost i.e temp.right =current.right
                temp.right = current.right;
                // now assign current.left to current.right
                current.right = current.left;
                // make current.left to null
                current.left = null;
            }
            current = current.right;
        }
    }

    //https://leetcode.com/problems/validate-binary-search-tree/description/
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    private boolean helper(TreeNode node, Integer low, Integer high) {
        if (node == null) {
            return true;
        }

        if (low != null && node.val <= low) {
            return false;
        }

        if (high != null && node.val >= high) {
            return false;
        }

        boolean leftTree = helper(node.left, low, node.val);
        boolean rightTree = helper(node.right, node.val, high);

        return leftTree && rightTree;
    }


    //https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return Helper(root, p, q);
    }

    private TreeNode Helper(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) {
            return null;
        }

        // check if root matches with any of the nodes then root is the common ancestor i.e ans
        if (node == p || node == q) {
            return node;
        }

        TreeNode left = Helper(node.left, p, q);
        TreeNode right = Helper(node.right, p, q);
        // if left and right is not null means we got the answer
        if (left != null && right != null) {
            return node;
        }

        TreeNode ans = left == null ? right : left;
        return ans;
    }

    // https://leetcode.com/problems/kth-smallest-element-in-a-bst/
    int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        return helper(root, k).val;
    }

    private TreeNode helper(TreeNode node, int k) {
        if (node == null) {
            return null;
        }
        TreeNode left = helper(node.left, k);
        if (left != null) {
            return left;
        }
        count++;

        if (count == k) {
            return node;
        }

        return helper(node.right, k);

    }

    // https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        // first element as root
        int r = preorder[0];
        int index = 0;
        // now check the r in the inorder array
        for (int i = 0; i < inorder.length; i++) {
            if (r == inorder[i]) {
                index = i;
                break;
            }
        }

        TreeNode root = new TreeNode(r);
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, index + 1), Arrays.copyOfRange(inorder, 0, index));
        root.right = buildTree(Arrays.copyOfRange(preorder, index + 1, preorder.length), Arrays.copyOfRange(inorder, index + 1, inorder.length));

        return root;

    }

    // https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String data = String.join(", ", ser(root));
        return data;
    }

    private List<String> ser(TreeNode node) {
        List<String> list = new ArrayList<>();
        HelperSerialize(node, list);
        return list;
    }

    private void HelperSerialize(TreeNode node, List<String> list) {
        if (node == null) {
            list.add("null");
            return;
        }
        list.add(String.valueOf(node.val));
        HelperSerialize(node.left, list);
        HelperSerialize(node.right, list);
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        List<String> list = new ArrayList<>();
        String[] str = data.split(",");
        for (String val : str) {
            list.add(val);
        }
        return des(list);
    }


    private TreeNode des(List<String> list) {
        TreeNode node = helerDes(list);
        return node;
    }

    private TreeNode helerDes(List<String> list) {
        Collections.reverse(list);
        String val = list.remove(list.size() - 1);

        if (val.charAt(0) == 'n') {
            return null;
        }


        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = helerDes(list);
        node.right = helerDes(list);
        return node;
    }

    //approach 1
    // https://leetcode.com/problems/path-sum/
    public boolean hasPathSum1(TreeNode root, int targetSum) {
        return pathSumHelper(root, targetSum, 0);
    }

    private boolean pathSumHelper(TreeNode node, int targetSum, int nodeSum) {
        if (node == null) {
            return false;
        }
        nodeSum = nodeSum + node.val;
        if (targetSum == nodeSum && (node.left == null && node.right == null)) {
            return true;
        }


        boolean left = pathSumHelper(node.left, targetSum, nodeSum);
        boolean right = pathSumHelper(node.right, targetSum, nodeSum);

        return left || right;

    }

    // approach 2
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (targetSum == root.val && root.left == null && root.right == null) {
            return true;
        }

        // keep substracting root value from targetSum and if at leaf node its marches then return true
        boolean left = hasPathSum(root.left, targetSum - root.val);
        boolean right = hasPathSum(root.right, targetSum - root.val);

        return left || right;
    }

    // https://leetcode.com/problems/sum-root-to-leaf-numbers/
    public int sumNumbers(TreeNode root) {
        return sumNumbersHelper(root, 0);
    }

    private int sumNumbersHelper(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }

        sum = sum * 10 + node.val;
        // check if its leaf node
        if (node.left == null && node.right == null) {
            return sum;
        }

        int leftSum = sumNumbersHelper(node.left, sum);
        int rightSum = sumNumbersHelper(node.right, sum);

        return leftSum + rightSum;

    }

    // https://leetcode.com/problems/binary-tree-maximum-path-sum/description/
    int maxPathSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        helpermaxPathSum(root);
        return maxPathSum;
    }

    private int helpermaxPathSum(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = helpermaxPathSum(node.left);
        int right = helpermaxPathSum(node.right);

        left = Math.max(0, left);
        right = Math.max(0, right);

        int pathSum = node.val + left + right;
        maxPathSum = Math.max(pathSum, maxPathSum);

        return Math.max(left, right) + node.val;
    }


    // find if Path Exists in Binary Tree from Root to Leaf given path as array
    public boolean findPath(TreeNode root, int[] arr) {
        if (root == null) {
            return arr.length == 0;
        }
        return helperFindPath(root, arr, 0);
    }

    private boolean helperFindPath(TreeNode node, int[] arr, int index) {
        if (node == null) {
            return false;
        }

        if (index >= arr.length || node.val != arr[index]) {
            return false;
        }

        // check if leaf node
        if (node.left == null && node.right == null && index == arr.length - 1) {
            return true;
        }

        return helperFindPath(node.left, arr, index + 1) || helperFindPath(node.right, arr, index + 1);
    }

}
