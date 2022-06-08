package recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TargetSum {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(4);
        //nums.add(-1);
        //int[] nums = {1,2,3};
        int k = 4;
        boolean flag = false;

        int slate = 0;
        //List<Integer> slate = new ArrayList<>();
        //isTargetSumPresent(nums, k,0, slate, flag);
       //flag = isTargetSumPresent1(nums, k,0, slate);
        isTargetSumPresent(nums, k, 0, new ArrayList<>(), flag);
        System.out.println(flag);
    }

    public static boolean isTargetSumPresent1(ArrayList<Integer> nums, int k, int index, int slate) {
        boolean res = false;
        if(slate == k){
            return true ;
        }
        if(index == nums.size()){
            return false;
        }

        res = isTargetSumPresent1(nums, k,index+1, slate);
            if(res == true)
                return true;
        res= isTargetSumPresent1(nums, k,index+1, slate+nums.get(index));
        return res;
       // slate = slate - nums.get(index);


    }


    private static void isTargetSumPresent(ArrayList<Integer> nums, int k, int index, List<Integer> slate, boolean flag) {
       // adding value of the slate to compare with the target k
        int sum =0;
        for(int i : slate){
            sum = sum+i;
        }

       if(sum == k){
           flag = true;
           return ;
        }

        if(index == nums.size()){
            return ;
        }

        // excluding element at index in slate
        isTargetSumPresent(nums, k, index+1, new ArrayList<>(slate), flag);

        // including element at index in slate
        slate.add(nums.get(index));
        isTargetSumPresent(nums, k, index+1, new ArrayList<>(slate), flag);
        slate.remove(slate.size()-1);
    }
}
