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

class MorrisTraversal{
	public void morris(TreeNode root){
		TreeNode curr;
		TreeNode prev;
		if(root == null){
			return ;
		}

		curr = root;

		while(curr != null){
			if(curr.left == null){
				System.out.print(curr.val + " ");
				curr = curr.right;
			}
			else{
				pre = curr.left;

				while(pre.right != null && pre.right != curr){
					pre = pre.right;

					if (pre.right == null) { 
                    pre.right = current; 
                    current = current.left; 
                } 
                else { 
                    pre.right = null; 
                    System.out.print(curr.val + " "); 
                    curr = curr.right; 
                	}
		}
	    }
	 }
	}
}
