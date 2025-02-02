class Solution {
    public boolean check(int[] nums) {
        if(nums[0]>=nums[nums.length-1]){
            int pivot =0;
            for(int i=1;i<nums.length;i++){
                if(nums[i]<nums[i-1]){
                    pivot = i;
                    break;
                }
            }
            for(int i=pivot+1;i<nums.length;i++){
                if(!(nums[i]>=nums[i-1])){
                    return false;
                }
            }
            return true;
        }
        else{
             for(int i=1;i<nums.length;i++){
                if(!(nums[i]>=nums[i-1])){
                    return false;
                }
            }
            return true;
        }
    }
}