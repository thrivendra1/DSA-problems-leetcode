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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> result=new ArrayList<>();

        Zigzag(root,result);
        return result;
    }

    void Zigzag(TreeNode root, List<List<Integer>> result)
    {
        if(root==null) return;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        boolean lefttoright=true;

        while(!q.isEmpty())
        {
            LinkedList<Integer> level=new LinkedList<>();
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode current=q.poll();

                if(lefttoright)
                {
                    level.addLast(current.val);
                }
                else
                {
                    level.addFirst(current.val);
                }


                if(current.left!=null)
                {
                    q.add(current.left);
                }
                if(current.right!=null)
                {
                    q.add(current.right);
                }
            }

            lefttoright=!lefttoright;

            result.add(level);


        }
    }
}