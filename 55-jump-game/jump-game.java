class Solution {
    public boolean canJump(int[] nums) {
        int currReach = 0;
        int maxReach = 0;
        for(currReach =0;currReach<nums.length;currReach++){
            if(currReach>maxReach){
                return false;
            }
            maxReach = Math.max(maxReach,nums[currReach]+currReach);
        }
        return true;
    }
}