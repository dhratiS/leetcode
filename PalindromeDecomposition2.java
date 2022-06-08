package recursion;

import java.util.ArrayList;

public class PalindromeDecomposition2 {
    public static void main(String[] args) {
        String str = "abcbcdefe";
        ArrayList<String> res =  new ArrayList<>();

        System.out.println(helper(str, res));
    }
    static ArrayList<String> helper(String str, ArrayList<String> res){
        for(int i = 0; i < str.length(); i++){
            for(int j = i; j < str.length(); j++){
                if(isPalindrom(i, j, str)){
                    res.add(str.substring(i,j+1));
                }
            }
        }
        return  res;
    }

    public static boolean isPalindrom(int start,int end,String s){

        while(start < end){
            if(s.charAt(start) != s.charAt(end))
                return false;
            else{
                start++;
                end--;
            }
        }
        return true;
    }
}
