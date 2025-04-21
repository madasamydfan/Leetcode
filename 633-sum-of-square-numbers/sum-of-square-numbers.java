class Solution {
    public boolean judgeSquareSum(int c) {
       for(int i=0;i<=(int)Math.sqrt(c);i++){
        int temp = i*i;
        int j = c - temp;
        int j_sqrt = (int)Math.sqrt(j);
        if(j_sqrt * j_sqrt == j){
            return true;
        } 
       }
       return false;
    }
}