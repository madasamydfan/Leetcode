class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int  maxLength =1;
        int tempLength =1;
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[i]<nums[j]){
                tempLength++;
            }
            else{
                tempLength =1;
            }
            if(tempLength>maxLength){
                maxLength = tempLength;
            }
            i++;
            j++;  
        }
        i=nums.length-1;
        j=nums.length-2;
        int maxLength2 =1;
        int tempLength2 =1;
        while(j>=0){
            if(nums[i]<nums[j]){
                tempLength2++;
                // System.out.println(tempLength2)
            }
            else{
                tempLength2 =1;
            }
            if(tempLength2>maxLength2){
                maxLength2= tempLength2;
            }
            i--;
            j--;  
        }
        return (maxLength>maxLength2)?maxLength:maxLength2;
    }
}