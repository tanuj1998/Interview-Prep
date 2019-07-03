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
Given a binary search tree, write a function to find the kth smallest element in the tree.
*/
public class KthSmallestElement {
    int res = 0;
    int c = 0;
    
    void inOrder(TreeNode node, int B){
        if(node == null){
            return;
        }
        inOrder(node.left,B); 
        //As the smallet elements are on the left side.
        c++;
        if(c == B){
            res = node.val;
        }
        inOrder(node.right,B);
    }
    
    public int kthsmallest(TreeNode A, int B) {
        inOrder(A,B);
        return res;
    }
}