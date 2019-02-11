/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    
    public TreeNode helper(ArrayList<Integer> arr,int l,int h){
        if(l>h)
            return null;
        int mid=(l+h)/2;
        TreeNode root1=new TreeNode(arr.get(mid));
        root1.left=helper(arr,l,mid-1);
        root1.right=helper(arr,mid+1,h);
        return root1;
    }
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        while(head!=null){
            arr.add(head.val);
            head=head.next;
            }
        TreeNode root=helper(arr,0,arr.size()-1);
        return root;
    }
}