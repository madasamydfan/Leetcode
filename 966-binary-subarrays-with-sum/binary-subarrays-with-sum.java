class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int currSum =0;
        int totalCount = 0;
        for(int num:nums){
            currSum+=num;
            if(currSum==goal){
                totalCount++;
            }
            if(map.containsKey(currSum-goal)){
                totalCount += map.get(currSum-goal);
            }
            map.put(currSum,map.getOrDefault(currSum,0)+1);
        }
        return totalCount;
    }
}