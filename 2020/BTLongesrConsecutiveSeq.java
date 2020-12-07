class Solution {
    int ans = 0;
    public int longestConsecutive(TreeNode root) {
        helper(root,null,0);
        return ans;
    }

    public void helper(TreeNode root, TreeNode parent, int len) {
        if (root == null){
            return;
        }
        if(parent != null && root.val == parent.val + 1){
            len = len+1;
        }
        else{
            len = 1;
        }
        ans = Math.max(ans, len);
        helper(root.left, root, len);
        helper(root.right, root, len);
    }
}