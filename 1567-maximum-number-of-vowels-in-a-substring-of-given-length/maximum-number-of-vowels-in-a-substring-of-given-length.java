class Solution {
    public boolean isVowel(char c){
        if (c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u')
        return true;
        else
        return false;
    }
    public int maxVowels(String s, int k) {
        int countOfVowels=0;
        int maxCount = Integer.MIN_VALUE;
        int i=0;
        int j=0;
        while(j<k){
            if(isVowel(s.charAt(j))){
                countOfVowels++;
            }
            j++;
        }
        System.out.println(countOfVowels);
        maxCount = Math.max(countOfVowels,maxCount);
        while(j<s.length()){
            if(isVowel(s.charAt(i)))countOfVowels--;
            if(isVowel(s.charAt(j)))countOfVowels++;
            i++;
            j++;
            maxCount = Math.max(countOfVowels,maxCount);
        }
        return maxCount;
    }
}