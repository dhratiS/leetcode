
    /*
    For your reference:
    class LinkedListNode {
        Integer value;
        LinkedListNode next;

        LinkedListNode(Integer value) {
            this.value = value;
            this.next = null;
        }
    }
    */
    static LinkedListNode merge_k_lists(ArrayList<LinkedListNode> arr) {
        // Write your code here.
        if(arr.isEmpty())
            return null;

        LinkedListNode LinkedListNode = arr.get(0);

        for(int i = 1; i <= arr.size()-1; i++){
            if(LinkedListNode != null && arr.get(i) != null)
            LinkedListNode = merge(LinkedListNode, arr.get(i));
        }
        return LinkedListNode;
    }
    
    public static LinkedListNode merge( LinkedListNode nodelist1,
                           LinkedListNode nodelist2) {
        LinkedListNode temp, head;
        if(nodelist1.value <= nodelist2.value){
            temp = new LinkedListNode(nodelist1.value);
            nodelist1 = nodelist1.next;
        }
        else{
            temp = new LinkedListNode(nodelist2.value);
            nodelist2 = nodelist2.next;
        }
        head = temp;
        while(nodelist1 != null && nodelist2 != null){

            if(nodelist1.value <= nodelist2.value){
                temp.next = new LinkedListNode(nodelist1.value);
                nodelist1 = nodelist1.next;
            }
            else{
                temp.next = new LinkedListNode(nodelist2.value);
                nodelist2 = nodelist2.next;
            }
            temp =temp.next;
        }
        while(nodelist1 != null){
            temp.next = new LinkedListNode(nodelist1.value);
            nodelist1 = nodelist1.next;
            temp =temp.next;
        }

        while(nodelist2 != null){
            temp.next = new LinkedListNode(nodelist2.value);
            nodelist2 = nodelist2.next;
            temp =temp.next;
        }

        return head;
    }
    
    

