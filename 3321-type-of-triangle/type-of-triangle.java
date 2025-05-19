class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        boolean isValid=false;
        if(nums[0]+nums[1] > nums[2]){
            isValid=true;
        }
        int countOfUniques=0;
        if(isValid){
            if(nums[1]!=nums[0] && nums[1]!=nums[2]){
                return "scalene";
            }
            else if(nums[0]==nums[1] && nums[1]==nums[2]){
                return "equilateral";
            }
            else{
                return "isosceles";
            }
        }
        return "none";
    }
}