//Another approach was make a helper function and use recursion to traverse the tree.
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List <Integer> ans = new ArrayList <>();
        Stack <TreeNode> st = new Stack <>();
        TreeNode current = root;

        while(current != null || !st.isEmpty()){
            while (current != null) {
                st.push(current);
                current = current.left;
            }
            current = st.pop();
            ans.add(current.val);
            current= current.right;
        }
        return ans;
    }
}