
    static ArrayList<Integer> pair_sum_sorted_array(ArrayList<Integer> numbers, Integer target) {
        // Write your code here.
        ArrayList<Integer> res = new ArrayList<>();
        findTarget(numbers, target, res);
        if(res.size() == 0){
            res.add(-1);
            res.add(-1);
        }
        return res;
    }
    
    static void findTarget(ArrayList<Integer> numbers, Integer target, ArrayList<Integer> res){
        int beg = 0;
        int end = numbers.size() - 1;
        Integer sum = 0;
        
        while(beg < end){
            sum = numbers.get(beg) + numbers.get(end);
            if(sum.compareTo(target) == 0){
                res.add(beg);
                res.add(end);
                return;
            }
            else if(sum.compareTo(target) < 0){
                beg++;
            }
            else{
                end--;
            }
            
        }
        
        
    }

