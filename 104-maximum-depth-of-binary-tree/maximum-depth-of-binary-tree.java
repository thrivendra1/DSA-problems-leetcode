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
    public int maxDepth(TreeNode root) 
    {
        if(root==null) return 0;

        int lh=maxDepth(root.left);
        int rh=maxDepth(root.right);
        return 1+Math.max(lh,rh);

            /*
        // level order code (zigzagLevelOrderlevel5)
        if(root==null) return 0;

        int count=0;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            count++;

            int size=q.size();

            for(int i=0;i<size;i++)
            {
                TreeNode current=q.poll();                
                if(current.left!=null) q.add(current.left);
                if(current.right!=null) q.add(current.right);
            }
        }

        return count;
        */
        
    }
}