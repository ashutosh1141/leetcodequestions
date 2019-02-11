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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
            return null;
        TreeNode head=helper(nums,0,nums.length-1);
        return head;
    }
    public TreeNode helper(int[] nums,int l,int h){
        if(l>h)
            return null;
        int mid=(l+h)/2;
        TreeNode t1=new TreeNode(nums[mid]);
        t1.left=helper(nums,l,mid-1);
        t1.right=helper(nums,mid+1,h);
        return t1;
    }
}