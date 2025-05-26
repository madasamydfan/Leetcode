class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] smallerElements = new int[nums.length];
        int[] largerElements = new int[nums.length];
        int[] resultArray = new int[nums.length];
        int equalElements =0;
        int i=0;
        int j=0;
        for(int num:nums){
            if(num<pivot){
                smallerElements[i]=num;
                i++;
            }
            else if(num >pivot) {
                largerElements[j]=num;
                j++;
            }
            else{
                equalElements++;
            }
        }
        int iterator=0;
        System.out.println(i+" "+j+" "+equalElements);
        for(int ii=0;ii<i;ii++){
            resultArray[iterator]= smallerElements[ii];
            iterator++;
        }
        for(int ii=0;ii<equalElements;ii++){
            resultArray[iterator]= pivot;
            iterator++;
        }
        System.out.println(iterator);
        for(int ii=0;ii<j;ii++){
            resultArray[iterator]= largerElements[ii];
            iterator++;
        }
      
        return resultArray;

    }
}