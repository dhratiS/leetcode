package recursion;

import java.util.ArrayList;

public class GenerateAllCombination {

    public static void main(String[] args) {
        ArrayList<Integer> demo = new ArrayList<>();
        demo.add(1);
        demo.add(3);
        demo.add(4);
        demo.add(-1);
        //System.out.println(generate_all_combinations(demo, 4));
        if(!demo.contains(38)){
            demo.add(78);
        }
        System.out.println(demo);
    }
    static ArrayList<ArrayList<Integer>> generate_all_combinations(ArrayList<Integer> arr, Integer target) {
        // Write your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        helper(new ArrayList(arr), target, 0, res);
        return res;
    }

    static void helper(ArrayList<Integer> slate, int target, int index
            , ArrayList<ArrayList<Integer>> res){
        int sum = 0, temp;
        if(slate.size() > 0){
            for(int i : slate){
                sum = i+sum;
            }
        }

        if(sum == target ){
            res.add(new ArrayList<>(slate));
            return;
        }
        else if(slate.size() <= index && sum == target){
            res.add(new ArrayList<>(slate));
            return;
        }
        if(slate.size() <= index)
            return;

        helper(slate, target, index+1, res);

        temp = slate.get(index);
        slate.remove(index);
        helper(slate, target, index+1, res);
        slate.add(index, temp);

    }
}
