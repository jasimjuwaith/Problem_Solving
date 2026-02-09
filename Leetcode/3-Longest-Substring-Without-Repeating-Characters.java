class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Integer, Character> ht = new HashMap<>();

        if(s.length() == 1) return 1;

        int count = 0;

        for(int i = 0;i<s.length();i++){
            for(int j = i;j<s.length();j++){
                if(ht.containsValue(s.charAt(j))){
                    count = count < ht.size() ? ht.size() : count;
                    ht.clear();
                    break;
                }else{
                    ht.put(j,s.charAt(j));
                }
            }
        }
        return count;
    }
}