class Solution {
    public int maxSubArray(int[] nums) {
        int maxEnding =0;
        int maxValue = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            maxEnding += (nums[i]);
            if(maxEnding>maxValue){
                maxValue = maxEnding;
            }
            if(maxEnding<0){
                maxEnding = 0;
            }
        }
        return maxValue;
    }
}