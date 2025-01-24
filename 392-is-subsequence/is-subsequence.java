class Solution {
    public boolean isSubsequence(String s, String t) {
        int ptr1=0;
        int ptr2=0;
        while(ptr2<t.length() && ptr1<s.length()){
            if(s.charAt(ptr1)==t.charAt(ptr2)){
                ptr2++;
                ptr1++;
            }
            else{
                ptr2++;
            }
        }
        if(ptr1==s.length()){
            return true;
        }
        else{
            return false;
        }
    }

}
