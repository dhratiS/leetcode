
    static ArrayList<Integer> find_intersection(ArrayList<Integer> arr1, ArrayList<Integer> arr2, ArrayList<Integer> arr3) {
        // Write your code here
        ArrayList<Integer> res = new ArrayList<>();
        helper(arr1, arr2, arr3, res);
        
        return res;
    }

    static void helper(ArrayList<Integer> arr1, ArrayList<Integer> arr2,
                        ArrayList<Integer> arr3, ArrayList<Integer> res){
        
        int l1 = 0, l2 = 0, l3 = 0;
        
        while(l1 < arr1.size() && l2 < arr2.size() && l3 < arr3.size() ){
            if( arr1.get(l1).equals(arr2.get(l2)) && arr1.get(l1).equals(arr3.get(l3)) ){
                res.add(arr1.get(l1));
                l1++;
                l2++;
                l3++;
            }
            else{
                int min = Math.min(arr1.get(l1), arr2.get(l2) );
                min = Math.min(min, arr3.get(l3));
                if( arr1.get(l1).equals(min) )
                    l1++;
                else if( arr2.get(l2).equals(min) )
                    l2++;
                else if( arr3.get(l3).equals(min) )
                    l3++;
                
            }
            
        }
        if(res.isEmpty()){
            res.add(-1);
        }
        
    }
