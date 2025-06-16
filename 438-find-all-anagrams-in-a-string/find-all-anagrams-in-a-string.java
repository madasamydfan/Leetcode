class Solution {
    public boolean checkAnagram(int[] s_array,int[] p_array){
        for(int i=0;i<26;i++){
            if(p_array[i]!=s_array[i]){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> resultList = new ArrayList<>();
        int[] p_array = new int[26];
        int[] s_array = new int[26];
        for(char c : p.toCharArray()){
            p_array[c-97]+=1;
        }
        int i=0;
        int j=0;
        while(j<s.length()){
            if(j-i < p.length()){
                s_array[s.charAt(j)-97]+=1;
                j++;
            }
            else{
                if(checkAnagram(s_array,p_array)){
                    resultList.add(i);
                }
                s_array[s.charAt(i)-97]-=1;
                i++;
            }
        }
         if(checkAnagram(s_array,p_array)){
                    resultList.add(i);
                }
        return resultList;
    }
}