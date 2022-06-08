package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class PossibleSum {
    public static void main(String[] args) {


        ArrayList<Long> nums = new ArrayList<>();
        //nums = (ArrayList<Long>) Arrays.asList(2L,4L,6L,1L,3L,8L,41L,14L,61L);
        nums.add(1L);
        nums.add(3L);
        nums.add(4L);
        nums.add(13L);
        nums.add(1L);
        nums.add(56L);
        nums.add(44L);
        nums.add(7L);
        nums.add(9L);

        System.out.println( check_if_sum_possible(nums, 14L));
    }
    static Boolean check_if_sum_possible(ArrayList<Long> arr, Long k) {
        return isTargetSumPresent(arr, k, 0, new ArrayList<Long>());
    }

    private static Boolean isTargetSumPresent(ArrayList<Long> nums, Long k, int index, ArrayList<Long> slate) {

        // adding value of the slate to compare with the target k
        long sum =0;
        for(long i : slate){
            sum = sum+i;
        }

        if(sum == k && slate.size() > 0){
            return true;
        }

        if(index == nums.size()){
            return false;
        }

        boolean isPos = false;

        // excluding element at index in slate

        isPos |= isTargetSumPresent(nums, k, index+1, new ArrayList<>(slate));

        // including element at index in slate
        slate.add(nums.get(index));
        isPos |= isTargetSumPresent(nums, k, index+1, new ArrayList<>(slate));
        slate.remove(slate.size()-1);

        return isPos;
    }
}