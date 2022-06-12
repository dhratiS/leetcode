class Solution {
    public int firstUniqChar(String s) {
        int flag = 0;
        if (s.length() == 1)
            return 0;
        else {
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < s.length(); j++) {
                    if(i!=j)
                        flag = j;
                    if (s.charAt(i) == s.charAt(j) && i != j)
                        break;
                }
                if (s.charAt(i) != s.charAt(flag))
                    return i;
            }
            return -1;
        }
    }
}
