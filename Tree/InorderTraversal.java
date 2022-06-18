
    /*
    For your reference:
    class BinaryTreeNode {
        Integer value;
        BinaryTreeNode left;
        BinaryTreeNode right;

        BinaryTreeNode(Integer value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }
    */
    static ArrayList<Integer> inorder(BinaryTreeNode root) {
        // Write your code here.
        ArrayList<Integer> res = new ArrayList();
        helper(root, res);
        return res;
    }
    
    static void helper(BinaryTreeNode root, ArrayList<Integer> res){
        if(root == null)
            return;
            
        helper(root.left, res);
        res.add(root.value);
        helper(root.right, res);
        
    }

