import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BinaryTreeTest {
    @Test
    public void testEmptyTree() {
        BinaryTree tree = new BinaryTree();
        assertEquals(0, tree.maxDepth(null));
    }

    @Test
    public void testSingleElementTree() {
        BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode(1);
        assertEquals(1, tree.maxDepth(root));
    }

    @Test
    public void testBalancedTree() {
        BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        assertEquals(2, tree.maxDepth(root));
    }

    @Test
    public void testLeftHeavyTree() {
        BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        assertEquals(3, tree.maxDepth(root));
    }

    @Test
    public void testRightHeavyTree() {
        BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        assertEquals(3, tree.maxDepth(root));
    }

    @Test
    public void testMixedDepthTree() {
        BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        assertEquals(3, tree.maxDepth(root));
    }
}
