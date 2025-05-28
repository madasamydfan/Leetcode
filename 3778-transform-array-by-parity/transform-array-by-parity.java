class Solution {
    public int[] transformArray(int[] nums) {
        int countOfEvens =0;
        int countOfOdds = 0;
        for(int i:nums){
            if(i%2==0)countOfEvens++;
            else countOfOdds++;
        }
        for(int i=0;i<countOfEvens;i++){
            nums[i]=0;
        }
        for(int i=countOfEvens;i<countOfEvens+countOfOdds;i++){
            nums[i]=1;
        }
        return nums;
    }
}