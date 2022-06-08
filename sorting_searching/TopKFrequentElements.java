
    static ArrayList<Integer> find_top_k_frequent_elements(ArrayList<Integer> arr, Integer k) {
        // Write your code here.
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int element : arr){
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
        int count = k;
        
        Iterator iterator = map.keySet().iterator();
       
        while(iterator.hasNext()){
            pq.add((Integer)iterator.next());
            if(pq.size()>k){
	                pq.poll();
	            }
        }


        return new ArrayList<Integer>(pq);
    }

