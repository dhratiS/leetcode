
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
    static ArrayList<ArrayList<Integer>> level_order_traversal(BinaryTreeNode root) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        helper(root, res);
        return res;
    }
    
    static void helper(BinaryTreeNode root,
                        ArrayList<ArrayList<Integer>> res){
        Queue<BinaryTreeNode> q = new LinkedList<>();
        if(root == null){
            return;
        }
        
        q.add(root);
        int count;
        BinaryTreeNode temp;
        ArrayList<Integer> slate;
        
        while(!q.isEmpty()){
            count = q.size();
            slate = new ArrayList<Integer>();
           for(int i = 0; i < count; i++){
             temp = q.remove();
             slate.add(temp.value);
             if(temp.left != null)
                q.add(temp.left);
             if(temp.right != null)
                q.add(temp.right);
           
           }
            res.add(new ArrayList<>(slate));
        }
        
        
    }
    

