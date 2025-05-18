class Solution {
    public int strStr(String haystack, String needle) {
        int i=0;
        int j=0;
        int k=0;
        while(i<haystack.length() && j<needle.length()){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }
            else{
                j=0;
                k++;
                i=k;
            }
            if(j==needle.length()){
                return (i-needle.length());
            }
        }
        return -1;    
    }
}