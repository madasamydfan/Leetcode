class Solution {
    public int maxDistance(int[] colors) {
        int leftptr =0;
        int rightptr = colors.length-1;
        int currMax =0;
        int resultMax = 0;
        int i=leftptr+1;
        while(i<colors.length){
            if(colors[i] != colors[leftptr]){
                currMax = Math.abs(leftptr-i);
            }
            i++;
            if(currMax > resultMax){
                resultMax =currMax;
            }
        }
        i=rightptr-1;
        while(i>=0){
            if(colors[i] != colors[rightptr]){
                currMax = Math.abs(rightptr-i);
            }
            i--;
            if(currMax > resultMax){
                resultMax =currMax;
            }
        }
        return resultMax;
    }
}