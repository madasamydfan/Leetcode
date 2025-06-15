class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int minimalLength = Integer.MAX_VALUE;
      int i=0;
      int j=0;
      int currSum = 0;
      while(j<nums.length){
        currSum+=nums[j];
        j++;
        while(currSum>=target){
            minimalLength = Math.min(minimalLength,j-i);
            currSum-=nums[i];
            i++;
        }
      }
      return minimalLength!= Integer.MAX_VALUE ? minimalLength :0;

    }
}
