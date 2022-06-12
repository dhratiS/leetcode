class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()|| s.length()<1 || t.length()<1) 
            return false;
        HashMap<Character, Integer> map = new HashMap();
        
        // put everything in map
        for(int i=0; i<s.length(); i++){
            if(map.isEmpty())
                map.put(s.charAt(i), 1);
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else
                map.put(s.charAt(i), 1);
        }

        for(int i=0; i<t.length(); i++){
            if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i)) > 0){
                map.put(t.charAt(i), map.get(t.charAt(i))-1);
            }
            else
                return false;
        }
        return true;
    }
}
