class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int ksum =0;
        int tempsum =0;
        for(int i=0;i<k;i++){
            tempsum+=cardPoints[i];
        }
        ksum=tempsum;
        int j=0;
        while(j<k){
            tempsum-=cardPoints[k-j-1];
            tempsum+=cardPoints[cardPoints.length-j-1];
            if(tempsum>ksum){
                ksum=tempsum;
            }
            j++;
        }
        return ksum;
    }
}