class Solution {
    public int climbStairs(int n) {
        if(n==1 ||n==0){
            return 1;
        }
        int curr =1;
        int prev =1;
        for(int i=2;i<=n;i++){
            int temp = curr;
            curr = curr+ prev;
            prev = temp;
        }
       return curr;
    }
}