class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();

        for(String str : strs){
            char []ch = str.toCharArray();
            Arrays.sort(ch);
            String word = new String(ch);
            if(!mp.containsKey(word)){
                mp.put(word, new ArrayList<>());
            }
            mp.get(word).add(str);
        }
        return new ArrayList<>(mp.values());
     }
}