class Solution {
    public int maxAscendingSum(int[] nums) {
     int resultMax = 0;
     int tempMax = 0;
    //  int i=0;
     int j=0;
     while(j<nums.length){
        if(j==0){
            tempMax+=nums[j];
        }
        else if(nums[j]>nums[j-1]){
            tempMax+=nums[j];
        }
        else{
            tempMax = 0;
            tempMax+=nums[j];
        }
        j++;
        if(tempMax>resultMax){
            resultMax = tempMax;
        }
        System.out.println(tempMax);
       
     }
   
     return resultMax;   
    }
}