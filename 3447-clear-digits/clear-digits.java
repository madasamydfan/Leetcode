class Solution {
    public String clearDigits(String s) {
        StringBuilder str = new StringBuilder(s);
        int i=0;
        while(i<str.length()){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                str.deleteCharAt(i);
            if(i>0){
                str.deleteCharAt(i-1);
                i--;
            }
            }
          else{
                i++;
            }
        }
        return str.toString();
    }
}