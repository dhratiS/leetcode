
    static Integer can_attend_all_meetings(ArrayList<ArrayList<Integer>> intervals) {
        // Write your code here.
        return helper(intervals);
    }
    
    static Integer helper(ArrayList<ArrayList<Integer>> intervals){
        if(intervals.isEmpty())
            return 0;
        Collections.sort(intervals, new Comparator<ArrayList<Integer>>() {
                    @Override
                    public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                        if(o1.get(0) < o2.get(0))
                            return -1;
                        return 1;
                    }
                }

        );
        
        for(int i = 0; i < intervals.size() - 1; i++){
            if(intervals.get(i).get(1) > intervals.get(i+1).get(0)){
                return 0;
            }
        }
        return 1;
    }

