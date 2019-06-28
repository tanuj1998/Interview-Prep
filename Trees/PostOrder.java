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

public class PostOrder {

    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode last = null;
        
        while(!(st.isEmpty()) || A != null){
            if(A != null){
                st.push(A);
                A = A.left;
            }
            else{
                TreeNode getN = st.peek();
                
                if(getN.right != null && last != getN.right){
                    A = getN.right;
                }
                else{
                    res.add(getN.val);
                    last = st.pop();
                }
            }
        }
        return res;
        
        
    }
}