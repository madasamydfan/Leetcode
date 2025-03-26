class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int [] answerList = new int[2];
        while(i<j){
            if(numbers[i]+numbers[j]==target){
                answerList[0]=i+1;
                answerList[1]=j+1;
                return answerList;
            }
            else if(numbers[i]+numbers[j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return answerList;
    }
}