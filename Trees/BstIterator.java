/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*
Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root 
node of a BST. The first call to next() will return the smallest number in BST. Calling next() again will 
return the next smallest number in the BST, and so on.
*/

public class Solution {

    private Stack<TreeNode> stack;
    
    public Solution(TreeNode root) {
        stack = new Stack<>();
        TreeNode node = root;
        while(node != null){
            stack.push(node);
            node = node.left;
        }
        
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        if(!hasNext()){
            return -1;
        }
        TreeNode node;
        node = stack.pop();
        int val = node.val;
        
        node = node.right;
        while(node != null){
            stack.push(node);
            node = node.left;
        }
        return val;
    }
}
