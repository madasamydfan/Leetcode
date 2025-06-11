class Solution {
    public boolean isPlaced (int gap,int[] position,int m){
        int prevPosition = position[0];
        int index = 0;
        int k=1;
        for(index = 1;index<position.length && k<m;index++){
            if(position[index]-prevPosition >= gap){
                prevPosition = position[index];
                k++;
            }
        }
        if(k==m){
            return true;
        }
        else{
            return false;
        }
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 0;
        int high = position[position.length-1]/(m-1);
        int answer=0;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(isPlaced(mid,position,m)){
                answer = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
          //  System.out.println(mid);
        }
        return answer;
        //System.out.println(isPlaced(1,position,m));
        //return 0;
    }
}