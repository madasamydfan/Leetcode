class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for(int i:nums){
            currSum = Math.max(currSum+i,i);
            MaxSum = Math.max(currSum,MaxSum);
        }
        return MaxSum;
    }
}