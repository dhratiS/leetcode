package recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

    public static List<String> letterCasePermutation(String str) {
        ArrayList<String> arr = new ArrayList<>();
        allCasePermutation(str, 0, new char[arr.size()] , arr);
        System.out.println(arr);
        return arr;
    }
    public static void allCasePermutation(String str, int index, char[] slate, ArrayList<String> res)
    {
        if(index >= str.length()){
            res.add(slate.toString());
        }
    }

    public static void main(String[] args) {
        String str = "a12b";
        letterCasePermutation(str);

    }



}

