class Solution {
    public int singleNumber(int[] nums) {
        HashSet set = new HashSet();
        int val=0;
        if(nums.length > 0){

            for(int i=0; i<nums.length; i++){
                if(!set.contains(nums[i]))
                    set.add(nums[i]);
                else if(set.contains(nums[i]))
                    set.remove(nums[i]);

            }
        }

        Iterator<Integer> it = set.iterator();


        // Iterate HashSet with the help of hasNext() and
        // next() method
            if(!set.isEmpty())
        while (it.hasNext()) {
            // Print HashSet values
            val= it.next();
        }

        return val;
    }
}
