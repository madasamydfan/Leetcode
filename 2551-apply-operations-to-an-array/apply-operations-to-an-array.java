class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
            else{
                continue;
            }
        }
        //int j=nums.length-1;
        int i=0;
        int k =0;
        int [] resultArray = new int[nums.length];
        for(i=0;i<nums.length;i++){
            if(nums[i]!=0){
                resultArray[k] = nums[i];
                k++;
            }
        }
        for(i = k;i<nums.length;i++){
            resultArray[i] = 0;
        }
        // while(i<j){
        //     if(nums[i]==0){
        //         int temp = nums[j];
        //         nums[j] = nums[i];
        //         nums[i] = temp;
        //         j--;
        //     }
        //     else{
        //         i++;
        //     }
        // }
        // return nums;
        return resultArray;
    }
}