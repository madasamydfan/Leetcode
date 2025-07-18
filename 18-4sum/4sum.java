class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> resultList = new  ArrayList<>();
        for(int i=0;i<nums.length-3;i++){
             if (i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j=i+1;j<nums.length-2;j++){
                 if (j > i+1 && nums[j] == nums[j - 1]) continue;
                int sum = nums[i]+nums[j];
                int k = j+1;
                int l = nums.length -1;
                while(k<l){
                       long tsum=(long)nums[i]+nums[j]+nums[k]+nums[l];
                       if(tsum==target){
                        resultList.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k],nums[l])));
                        while (k < l && nums[k] == nums[k + 1]) k++;
                        while (k < l && nums[l] == nums[l - 1]) l--;
                        l--;
                        k++;
                       }
                       else if(tsum > target){
                        l--;
                       } 
                       else{
                        k++;
                       }
                }
            }
        }
        return resultList;
    }
}