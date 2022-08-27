package Week_1;

public class Invert_Binary_Tree {

    static class TreeNode {
        int val;
        Invert_Binary_Tree.TreeNode left;
        Invert_Binary_Tree.TreeNode right;

        TreeNode(int data) {
            this.val = data;
            this.left = this.right = null;
        }
    }

    public static void main(String[] args) {
        Invert_Binary_Tree.TreeNode root = new Invert_Binary_Tree.TreeNode(1);
        root.left = new Invert_Binary_Tree.TreeNode(0);
        root.right = new Invert_Binary_Tree.TreeNode(2);
        root.right.left = new Invert_Binary_Tree.TreeNode(3);
        System.out.println(invertTree(root));
    }

    private static TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        // traversing through the left and right nodes of the tree and store them.
        TreeNode l = invertTree(root.left);
        TreeNode r = invertTree(root.right);

        // Swap the right and left nodes
        root.left = r;
        root.right = l;

        return root;
    }
}
