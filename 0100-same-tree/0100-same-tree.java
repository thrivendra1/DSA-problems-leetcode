/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean dataschecking=check(p,q);
        return dataschecking;
    }

    boolean check(TreeNode p,TreeNode q)
    {
        if(p==null && q==null) return true ;
        if(p==null || q==null) return false;
        return ((p.val==q.val)&&check(p.left,q.left)&& check(p.right,q.right));
    }

}