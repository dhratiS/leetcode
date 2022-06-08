package recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AllSubset {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> result = new LinkedList();
        List<Integer> slate = new LinkedList<>();
        allSubsets(nums, 0, slate, result);
        System.out.println(result);
    }

    private static void allSubsets(int[] nums, int index, List<Integer> slate, List<List<Integer>> result) {
        if(index == nums.length){
            result.add(slate);
            return;
        }

        allSubsets(nums, index+1, new ArrayList<>(slate), result);

        slate.add(nums[index]);
        allSubsets(nums,index+1, new ArrayList<>(slate), result);

    }
}
