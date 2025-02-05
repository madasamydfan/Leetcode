class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int count =0;
        int i =0;
        int[] arr = new int[3];
        int arrIndex =0;
        if(s1.length()!=s2.length()){
            return false;
        }
        // else if(s1.length()==2){
        //     return s1 == s2;
        // }
        while(i<s1.length()){
            if(count>2){
                return false;
            }
            if(s1.charAt(i)!= s2.charAt(i)){
                arr[arrIndex] = i;
                arrIndex++;
                count++;
            }
            i++;
        }
        i=arr[0];
        int j = arr[1];
        if(s1.charAt(i)==s2.charAt(j) && s1.charAt(j)==s2.charAt(i) && count<=2){
            return true;
        }
        else{
            return false;
        }
    }
}