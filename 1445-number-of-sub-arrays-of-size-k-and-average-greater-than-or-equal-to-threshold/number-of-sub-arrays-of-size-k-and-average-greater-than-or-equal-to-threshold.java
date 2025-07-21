class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i=0;
        int j=0;
        int sum =0;
        while(j<k){
            sum+=arr[j];
            j++;
        }
        int numOfSubarrays =0;
        while(j<arr.length){
            if(sum/k >= threshold){
                numOfSubarrays+=1;
            }
            sum -= arr[i];
            sum += arr[j];
            i++;
            j++;
        }
         if(sum/k >= threshold){
                numOfSubarrays+=1;
            }
        return numOfSubarrays;
    }
}