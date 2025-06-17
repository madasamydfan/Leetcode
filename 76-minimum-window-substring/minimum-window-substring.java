class Solution {
    public boolean doesContain(int[] s_array,int[] t_array){
        for(int i=0;i<t_array.length;i++){
            if(t_array[i]!=0 && !(t_array[i]<=s_array[i])){
                return false;
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {
        if(s.length()<t.length())return "";
        int[] s_array = new int[128];
        int[] t_array = new int[128];
        for(char c:t.toCharArray()){
            t_array[c]+=1;
        }
        int i=0;
        int j=0;
        int minLength = Integer.MAX_VALUE;
        int startIndex=0;
        while(j<s.length()){
            s_array[s.charAt(j)]+=1;
            j++;
            if(doesContain(s_array,t_array)){
                 
                while(doesContain(s_array,t_array)){
                if(minLength > (j-i)){
                    startIndex = i;
                    minLength = (j-i);
                 }
                    s_array[s.charAt(i)]-=1;
                    i++;
                }
            }
        }
        //  if(minLength > (j-i)){
        //     i--;
        //     startIndex = i;
        //     minLength = (j-i);
        // }
        return minLength == Integer.MAX_VALUE ? new String() :
        new String(s.toCharArray(),startIndex,minLength);
    }
}
 //return minLen == Integer.MAX_VALUE ? new String() :
               // new String(chS, startIndex, minLen);