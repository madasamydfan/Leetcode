class Solution {
    public void sortColors(int[] nums) {
        int zeros =0;
        int ones =0;
        int twos =0;
        for(int num :nums){
            if(num==0)zeros++;
            else if(num == 1)ones++;
            else if(num== 2)twos++;
        }
        for(int i=0;i<nums.length;i++){
            if(zeros>0){
                nums[i]=0;
                zeros--;
            }
            else if(ones>0){
                nums[i]=1;
                ones--;
            }
            else{
                nums[i]=2;
                twos--;
            }
        }
    }
}