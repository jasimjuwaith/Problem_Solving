class Solution {
    public int minimumPushes(String word) {
        int len = word.length();
        int []freq = new int[26];
        
        for(Character c : word.toCharArray()){
            freq[c - 'a']++;
        }

        Arrays.sort(freq);

        int res = 0; int assign = 0;
        for(int i = 25;i >= 0;i--){
            if(freq[i] == 0) break;
            res += freq[i] * (assign / 8 + 1);
            assign++;
        }
        return res;
    }
}
