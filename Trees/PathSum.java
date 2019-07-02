/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */

/*
Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all 
the values along the path equals the given sum.
*/
public class PathSum {
    public int hasPathSum(TreeNode A, int B) {
        if(A==null){
            return 0;
        }
        else if(A.left==null && A.right==null && A.val==B){
            return 1;
        }
        int left = hasPathSum(A.left,B-A.val);
        int right = hasPathSum(A.right,B-A.val);
        
        System.out.println(left);
        System.out.println(right);
        
        if(right == 1 || left == 1){
            return 1;
        }
        return 0;
    }
}