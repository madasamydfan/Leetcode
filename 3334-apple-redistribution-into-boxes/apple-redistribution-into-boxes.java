class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totalApples = 0;
        for(int num : apple){
            totalApples+=num;
        }
        Arrays.sort(capacity);
        int j = capacity.length-1;
        int minimumBoxes =0;
        while(j>=0 && totalApples>0){
            totalApples-=capacity[j];
            j--;
            minimumBoxes++;
        }
        return minimumBoxes;
    }
}