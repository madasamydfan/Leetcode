class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int temp = nums[i]*nums[j];
                map.put(temp,map.getOrDefault(temp,0)+1);
            }
        }
        int sum =0;
        for(int i:map.keySet()){
            if(map.get(i)>=2){
                // sum+=8*map.get(i);
                sum += 8 * (map.get(i) * (map.get(i) - 1)) / 2;
            }
        }
        return sum;
    }
}