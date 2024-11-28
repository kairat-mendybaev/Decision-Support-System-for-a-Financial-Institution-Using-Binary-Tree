public class BinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }

    // Time Complexity: The time complexity of the maxDepth method is O(n), where n is the number
    // of nodes in the tree. This is because each node is visited once.
    // Space Complexity: The space complexity is O(h), where h is the height of the tree. This space is
    // used on the call stack during the recursive calls.
}
