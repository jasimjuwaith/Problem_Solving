class Solution {
    public String largestNumber(int[] nums) {
        String []input = new String[nums.length];
        for(int i  = 0;i < nums.length;i++){
            input[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(input, (a,b)->(b+a).compareTo(a+b));
        if(input[0].equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < nums.length;i++){
            sb.append(input[i]);
        }
        return sb.toString();
    }
}
