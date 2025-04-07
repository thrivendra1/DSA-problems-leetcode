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
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> result=new ArrayList<>();
        level(root,result);

        return result;
        
    }

    public void level(TreeNode root,List<List<Integer>> result)
    {
        if(root==null) return;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            int size=q.size();
            LinkedList<Integer> level=new LinkedList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode current=q.poll();
                level.add(current.val);

                if(current.left!=null)
                {
                    q.add(current.left);
                }
                if(current.right!=null)
                {
                    q.add(current.right);
                }
            }
            result.add(level);
        }
    }
}