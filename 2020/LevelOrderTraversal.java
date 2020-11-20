class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, root, 0);
        return res;
    }
    
    public void helper(List<List<Integer>> res, TreeNode root, int level){
        if(root == null)return;
        if(res.size() == level){
            List<Integer> temp = new ArrayList<>();
            res.add(temp);
        }
        res.get(level).add(root.val);
        
        if(root.left != null)helper(res, root.left, level+1);
        if(root.right != null)helper(res, root.right, level+1);
    }
}