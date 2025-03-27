class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int temp;
        int index=nums1.length-1;
        while(j<nums2.length && j>=0 && i>=0){
            System.out.println(i+""+j);
            if(nums1[i]>nums2[j]){
                temp = nums1[i];
                nums1[i]= nums1[index];
                nums1[index]=temp;
                i--;
            }
            else{
                temp = nums2[j];
                nums2[j]= nums1[index];
                nums1[index]=temp;
                j--;
            }
            index--;
        }
        while(j>=0){
                temp = nums2[j];
                nums2[j]= nums1[index];
                nums1[index]=temp;
                j--;
                index--;
        }
    }
}