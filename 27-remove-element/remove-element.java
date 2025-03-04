class Solution {
    public int removeElement(int[] nums, int val) {
        int j = nums.length-1;
        int i = 0;
        while(i<=j){
            if(nums[i]==val){
                int temp = nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j--;
            }
            else{
                i++;
            }
        }
        return i;
    }
}