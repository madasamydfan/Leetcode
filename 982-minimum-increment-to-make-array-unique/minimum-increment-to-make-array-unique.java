class Solution {
    public int minIncrementForUnique(int[] nums) {
        int minNoOfMoves = 0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;){
            if(!(nums[i]<=nums[i-1])){
                i++;
                continue;
            }
            else{
                nums[i]++;
                minNoOfMoves++;
            }
        }
        return minNoOfMoves;
    }
}