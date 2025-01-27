class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        int result =0;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                result++;
                j--;
                i++;
            }
            else{
                result++;
                j--;
            }
        }
        return result;
    }
}