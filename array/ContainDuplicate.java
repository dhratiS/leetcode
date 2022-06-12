class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet set = new HashSet();
        boolean flag= false;
        if(nums.length==1)
            return false;
        if(nums.length>1){
            set.add(nums[0]);
            for(int i=1; i<nums.length; i++){
                if(set.contains(nums[i])){
                    return true;
                }
                else{
                    set.add(nums[i]);
                }
            }
        }
    return false;

    }
}
