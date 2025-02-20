class Solution {
    public int mySqrt(int x) {
        int low =1 ;
        int high = x/2+1;
        while(low<=high){
            int mid = (low+high)/2;
            if(Math.pow(mid,2)==x){
                return mid;
            }
            else if(Math.pow(mid,2)<x){
                low=mid+1;
            }
            else{
                high = mid-1;
            } 
        }
        return high;
    }
}