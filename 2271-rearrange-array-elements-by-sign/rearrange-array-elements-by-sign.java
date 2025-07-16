class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] tempArray = new int[nums.length];
        int pIndex=0;
        int nIndex=nums.length/2;
        for(int i:nums){
           if(i>0){
            tempArray[pIndex]=i;
            pIndex++;
           }
           else{
            tempArray[nIndex]=i;
            nIndex++;
           }
        }
        // System.out.println(Arrays.toString(tempArray));
        pIndex=0;
        nIndex=nums.length/2;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=tempArray[pIndex];
                pIndex++;
            }
            else{
                nums[i]=tempArray[nIndex];
                nIndex++;
            }
        }
        return nums;
    }
}