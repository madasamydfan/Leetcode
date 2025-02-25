class Solution {
    public int[] sortedSquares(int[] nums) {
        int ptr1 = 0;
        int ptr2 = nums.length-1;
        int k=nums.length-1;
        int [] resultArray = new int[nums.length];
        while(ptr1<=ptr2){
            if(Math.pow(nums[ptr1],2)>Math.pow(nums[ptr2],2)){
                resultArray[k] = nums[ptr1]*nums[ptr1];
                ptr1++;k--;
            }
            else{
                resultArray[k] = nums[ptr2]*nums[ptr2];
                ptr2--;
                k--;
            }
        }
        return resultArray;
    }

}