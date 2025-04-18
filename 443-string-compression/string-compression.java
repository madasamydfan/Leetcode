class Solution {
    public int compress(char[] chars) {
     char currCharacter = chars[0];
     int resultIndex =0;
     int iterator = 0;
     
     while(iterator<chars.length){
        currCharacter = chars[iterator];
        int count =0;
        while(iterator<chars.length && chars[iterator]  == currCharacter){
            iterator++;
            count++;
        }
        chars[resultIndex++] = currCharacter;
        if(count > 1){
         String countString = Integer.toString(count);
        for(char c : countString.toCharArray()){
            chars[resultIndex++] = c;
        }
        }
     }
     return resultIndex;
    }
}