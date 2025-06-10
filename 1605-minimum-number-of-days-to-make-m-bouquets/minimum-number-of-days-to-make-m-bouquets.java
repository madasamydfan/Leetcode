class Solution {
    public boolean canBouquetmade(int[] bloomDay,int days,int m,int k){
        int count = 0;
        for(int i:bloomDay){
            if(i<=days){
                count++;
                if(count==k){
                    m--;
                    count =0;
                }
            }
            else{
                count =0;
            }
        }
        return m<=0;
    }
    public int minDays(int[] bloomDay, int m, int k) {
       // int[] bloomDay = {1000000000,1000000000};
        if((long)(m*k)>bloomDay.length)return -1;
       int minElement = Integer.MAX_VALUE;
       int maxElement = Integer.MIN_VALUE;
       for(int i:bloomDay){
        if(i<minElement){
            minElement = i;
        }
        if(i>maxElement){
            maxElement = i;
        }
       }
       int ans=-1;
      //System.out.println(canBouquetmade(bloomDay,1000000000,m,k));
     // System.out.println("Hp");
       while(minElement<=maxElement){
        int mid = minElement+(maxElement-minElement)/2;
       // System.out.println(canBouquetmade(bloomDay,1000000000,m,k));
        if(canBouquetmade(bloomDay,mid,m,k)==true){
            ans = mid;
            // System.out.println(ans);
            maxElement = mid-1;
        }
        else{
            minElement = mid+1;
        }
       }
       return ans;
       // System.out.println(canBouquetmade(bloomDay,12,m,k));
        // return 1;
    }
}