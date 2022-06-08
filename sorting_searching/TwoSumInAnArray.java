static ArrayList<Integer> two_sum(ArrayList<Integer> numbers, Integer target) {
        // Write your code here.
        ArrayList<Integer> res = new ArrayList<>();
        helper(numbers, target, res);
        if(res.isEmpty()){
            res.add(-1);
            res.add(-1);
        }
        return res;
    }
    
    static void helper(ArrayList<Integer> numbers, Integer target, ArrayList<Integer> res
    ){
       
       HashMap<Integer, Integer> map = new HashMap<>(); 
       
       if(map.isEmpty()){
           map.put(numbers.get(0) , 0);
       }
       
       for(int i = 1; i < numbers.size(); i++){
           int find = target - numbers.get(i); 
           if(map.containsKey(find)){
               
               res.add(map.get(find));
               res.add(i);
               return;
               
           }
           else{
               map.put(numbers.get(i), i);
           }
           
       }
        
    }

