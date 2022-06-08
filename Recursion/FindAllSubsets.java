package recursion_revision;

import java.util.ArrayList;

public class FindAllSubsets {
    public static void main(String[] args) {
        Integer [] arr = {1,2,3};
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        helper(arr, 0, new ArrayList<Integer>(), res);
        System.out.println(res);
    }

    private static void helper(Integer[] arr, int index, ArrayList<Integer> slate, ArrayList<ArrayList<Integer>> res) {
        if(index >= arr.length){
            res.add(slate);
            return;
        }
        //include
        slate.add(arr[index]);
        helper(arr, index+1, new ArrayList<>(slate), res);
        slate.remove(slate.size()-1);
        helper(arr, index+1, new ArrayList<>(slate), res);
    }
}
