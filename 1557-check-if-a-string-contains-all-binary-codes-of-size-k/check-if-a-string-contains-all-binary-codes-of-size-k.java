class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> set = new HashSet<>();
        int i=0;
        int j=k;
        while(j<=s.length()){
            set.add(s.substring(i,j));
            i++;
            j++;
        }
        //set.add(s.substring(i,j));
        return (Math.pow(2,k)==set.size());
    }
}