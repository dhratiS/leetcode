class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        helper(s, 0, new ArrayList<>(), res);
        return res;
    }
    
   public void helper(String s, int index, ArrayList<String> slate, List<List<String>> res){
        String str = new String();
        if(index >= s.length()){
            res.add(new ArrayList<>(slate));
            //slate = new ArrayList<>();
            return;
        }
        for(int i = index; i < s.length(); i++){
            str = str+ s.charAt(i);
            if(isPalindrome(str)){
                str = s.substring(index, i+1);
                slate.add(str);
                helper(s, i+1, slate, res);
                slate.remove(slate.size()-1);
            }

        }

    }
    
    public boolean isPalindrome(String slate){
        int i = 0, end = slate.length()-1;
        while(i <= end){
            if(slate.charAt(i) != slate.charAt(end))
                return false;
            i++;
            end--;
        }
        return true;
    }
    
}
