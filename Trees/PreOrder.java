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
public class PreOrder {
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
      ArrayList<Integer> res = new ArrayList<Integer>();
      Stack<TreeNode> st = new Stack<TreeNode>();

      if(A == null){
        return null;
      }

      TreeNode curr = A;
      st.push(curr);

        while(st.size() > 0){
            curr = st.pop();
            res.add(curr.val);

            if(curr.right != null){
                st.push(curr.right);
            }
            
            if(curr.left != null){
                st.push(curr.left);
            }
            
        }

        return res;
    }
}