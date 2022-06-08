package recursion_revision;

import java.util.ArrayList;
import java.util.Arrays;

public class LetterCasePermutation {
    public static void main(String[] args) {
        String s = "a12cb";
        ArrayList<String> res =  new ArrayList<>();
        letterCasePerm(s, 0, new char[s.length()], res);
        System.out.println(res);
    }

    private static void letterCasePerm(String s, int index, char[] slate, ArrayList<String> res) {
        if(index >= s.length()){

            res.add(new String(slate));
            return;
        }

        char ch = s.charAt(index);
        if(Character.isLetter(ch)){
            slate[index] = Character.toUpperCase(ch);
            letterCasePerm(s,index+1, slate, res);
            slate[index] = Character.toLowerCase(ch);
            letterCasePerm(s, index+1, slate, res);
        }
        else{
            slate[index] = ch;
            letterCasePerm(s, index+1, slate, res);
        }
    }
}
