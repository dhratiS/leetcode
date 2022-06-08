
    static ArrayList<Integer> kth_largest(Integer k, ArrayList<Integer> initial_stream, ArrayList<Integer> append_stream) {
        // Write your code here.
        ArrayList<Integer> res = new ArrayList<>();
        helper(k, initial_stream, append_stream, res);
        return res;
    }
    
    public static void helper(Integer k, ArrayList<Integer> initial_stream, 
        ArrayList<Integer> append_stream, ArrayList<Integer> res){
            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
            
            for(Integer i : initial_stream){
                pq.add(i);
                if(pq.size() > k){
                    pq.poll();
                }
            }
            
            for(Integer i : append_stream){
                pq.add(i);
                if(pq.size() > k)
                    pq.poll();
                res.add(pq.peek());
            }
        }

