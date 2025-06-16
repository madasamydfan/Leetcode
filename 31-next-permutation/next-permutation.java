class Solution {
    public void reverse(int[] nums,int low,int high){
        while(low<high){
            int temp = nums[low];
            nums[low]=nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
    public void nextPermutation(int[] nums) {
        //Find the pivot first
        int pivotIndex = -1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivotIndex = i;
                break;
            }
        }
        if(pivotIndex==-1){
             reverse(nums,0,nums.length-1);
             return;
        }
        for(int i=nums.length-1;i>pivotIndex;i--){
            if(nums[i]>nums[pivotIndex]){
                int temp = nums[i];
                nums[i]=nums[pivotIndex];
                nums[pivotIndex] = temp;
                break;
            }
        }
         reverse(nums,pivotIndex+1,nums.length-1);
    }
}