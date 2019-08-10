/*
Given a binary tree, return the tilt of the whole tree.

The tilt of a tree node is defined as the absolute difference between the sum of all left 
subtree node values and the sum of all right subtree node values. Null node has tilt 0.

The tilt of the whole tree is defined as the sum of all nodes' tilt.
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
    int ans = 0;
    public int findTilt(TreeNode root) {
      helper(root);
      return ans;
    }
    public int helper(TreeNode temp){
        if(temp == null){
            return 0;
        }
        int l = helper(temp.left);
        int r = helper(temp.right);
        ans += Math.abs(l-r);
        
        return l+r+temp.val;
    }
}