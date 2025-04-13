class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int minimum =Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]<=nums[high]){
                minimum = Math.min(minimum,nums[mid]);
                high = mid-1;
            }
            else{
                //System.out.println("Hi");
                minimum = Math.min(minimum,nums[low]);
                low = mid+1;
            }
        }
        return minimum;
    }
}