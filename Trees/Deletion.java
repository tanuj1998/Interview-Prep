class BinarySearchTree 
{ 
    /* Class containing left and right child of current node and key value*/
    class Node 
    { 
        int key; 
        Node left, right; 
  
        public Node(int item) 
        { 
            key = item; 
            left = right = null; 
        } 
    } 
  
    // Root of BST 
    Node root; 
  
    // Constructor 
    BinarySearchTree() 
    { 
        root = null; 
    } 

    int minValue(Node root) 
    { 
        int minv = root.key; 
        while (root.left != null) 
        { 
            minv = root.left.key; 
            root = root.left; 
        } 
        return minv; 
    } 

    Node deleteRec(Node root, int key){
        if(root == null){
            return root;
        }

        if(key < root.key){
            root.left = deleteRec(root.left,key);
        }

        else if(key > root.key){
            root.right = deleteRec(root.right,key);
        }

        else{
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            root.key = minValue(root.right); //get the inorder successor (smallest in the right subtree)
 
            root.right = deleteRec(root.right, root.key); //delete the inorder successor
        }

        return root;

    }
}