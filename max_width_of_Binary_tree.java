/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
public int widthOfBinaryTree(TreeNode root){
      LinkedList<TreeNode> q1=new LinkedList<TreeNode>();
      if(root==null)
          return 0;
      q1.offer(root);
      root.val=0;
      int max=0;
      while(!q1.isEmpty()){
          int size=q1.size();
          max=Math.max(q1.peekLast().val-q1.peekFirst().val+1,max);
          for(int i=0;i<size;i++){
              TreeNode temp=q1.poll();
              if(temp!=null){
                  if(temp.left!=null){
                      temp.left.val=temp.val*2+1;
                      q1.offer(temp.left);
                  }
                  if(temp.right!=null){
                      temp.right.val=temp.val*2+2;
                      q1.offer(temp.right);
                  }
              }
          }
      }
    return max;
    }
}