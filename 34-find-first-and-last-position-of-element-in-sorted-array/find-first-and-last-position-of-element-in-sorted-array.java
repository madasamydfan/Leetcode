class Solution {
    public int[] searchRange(int[] nums, int target) {
        // int[] nums = {3,3,3,3,3,3};
        // target=3;
        int[] resultArray = new int[2];
        resultArray[0]=-1;
        resultArray[1]=-1;
        int low=0;int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            System.out.println(mid);
            if(nums[mid]==target){
                if(mid==0){
                    resultArray[0]=mid;
                    break;
                }
                if(mid-1 >=0 && nums[mid-1]!=target){
                    resultArray[0]=mid;
                    break;
                }
                else{
                    high=mid-1;
                }
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            System.out.println(mid);
            if(nums[mid]==target){
                // if(high-low == 1){
                //     if(nums[high]==target){
                //         resultArray[1]=high;
                //     }
                //     else{
                //         resultArray[1]=low;
                //     }
                // }
                if(mid==nums.length-1){
                    resultArray[1]=mid;
                    break;
                }
                if(mid+1 < nums.length && nums[mid+1]!=target){
                    resultArray[1]=mid;
                    break;
                }
                else{
                    low=mid+1;
                }
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return resultArray;
    }
}