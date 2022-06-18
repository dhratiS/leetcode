
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
    static ArrayList<ArrayList<Integer>> reverse_level_order_traversal(BinaryTreeNode root) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        helper(root, new ArrayList<>(), res);
        Collections.reverse(res);
        return res;
    }
    
    static void helper(BinaryTreeNode root, ArrayList<Integer> slate, 
                ArrayList<ArrayList<Integer>> res){
                    
            if(root == null)
                return;

            Queue<BinaryTreeNode> q = new LinkedList<>();
            BinaryTreeNode temp;
            q.add(root);
            int count = 0;
            while(!q.isEmpty()){
                count = q.size();
                
                for(int i = 0; i < count; i++){
                    temp =  q.remove();
                    slate.add(temp.value);
                    if(temp.left != null)
                     q.add(temp.left);
                    if(temp.right != null)
                     q.add(temp.right);
                }
                res.add(new ArrayList<>(slate));
                slate.clear();
            }
                    
    }

