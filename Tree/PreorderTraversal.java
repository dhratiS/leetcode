
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
    static ArrayList<Integer> preorder(BinaryTreeNode root) {
        // Write your code here.
        ArrayList<Integer> res = new ArrayList<Integer>();
        helper(root, res);
        return res;
    }
    
    static void helper(BinaryTreeNode root, ArrayList<Integer> res){
        if(root == null){
            return;
        }
        
        res.add(root.value);
        helper(root.left, res);
        helper(root.right, res);
        
    }

