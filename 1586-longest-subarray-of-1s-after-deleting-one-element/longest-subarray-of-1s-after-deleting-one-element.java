class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;
        int j=0;
        int k=1;
        int maxLength = Integer.MIN_VALUE;
        while(i<nums.length && j<nums.length){
            if(nums[j]==1){
                j++;
            }
            else if(nums[j]==0){
                if(k!=0){
                    k=0;
                    j++;
                }
                else{
                    maxLength = Math.max(j-i-1,maxLength);
                    while(nums[i]!=0){
                        i++;
                    }
                    i++;
                    k=1;
                }
            }
        }
        maxLength = Math.max(j-i-1,maxLength);
        return maxLength;
    }
}