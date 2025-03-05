class Solution {
    public int longestOnes(int[] nums, int k) {
        int i =0;
        int j=0;
        int temp =k;
        int maxlength =0;
        while(j<nums.length){
            if(nums[j]==1){
                j++;
            }
            else if(nums[j]==0 && temp>0){
                j++;
                temp--;
            }
            else{
                if(maxlength<(j-i)){
                    maxlength = j-i;
                }
                i++;
                j=i;
                temp =k;
            }
        }
        if(maxlength<(j-i)){
                    maxlength = j-i;
                }
        return maxlength;
    }
}