package Easy;

import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class mergeTrees617 {
    TreeNode treeNode=new TreeNode;
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        add(t1);
        add(t2);
        return treeNode;
    }

    public void add(TreeNode t1) {
        if (t1!= null) {
            treeNode=treeNode.val+t1.val;
            dfs(t1.left);
            dfs(t1.right);
        }

    }
}

