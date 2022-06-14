class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<String>();
        helper("", 0, 0, n, res);
        return res;
    }

    public void helper(String s, int o, int c, int n, ArrayList<String> res){
        String temp = "";
        /* approach
        1)if o == c == n
            res.add(s);
            return
        2) if o == c, o < n
            s = s + "("
            o++
        3) if c < o
            s = s + ")"
            c++
        */
        if(o == n && c == n){
            res.add(s);
            return;
        }
        else{
            if(o < n ){
                temp = s;
                s = s + "(";
                helper(s, o+1, c, n, res);
                s = temp;
            }
            if(o > c  ){
                temp = s;
                s = s + ")";
                helper(s, o, c+1, n, res);
                s = temp;
            }
        }


    }
}