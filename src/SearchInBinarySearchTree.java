

//https://leetcode.com/problems/search-in-a-binary-search-tree/
public class SearchInBinarySearchTree {

    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null) return null;
        if (val < root.val) return searchBST(root.left, val);
        if (val > root.val) return searchBST(root.right, val);
        if (val == root.val) return root;

        return null;
    }
}
