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

public class Inorder{
    public ArrayList<Integer> inorderTraversal(TreeNode A){
    	ArrayList<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> st = new Stack<TreeNode>();

        if(A == null){
            return A;
        }

        TreeNode curr = A;

        while(curr != null || st.size() > 0){

            while(curr != null){
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }
}