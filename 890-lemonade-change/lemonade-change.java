class Solution {
    public boolean lemonadeChange(int[] bills) {
        int noOfFives=0;
        int noOfTens = 0;
        for(int i:bills){
            if(i==5)noOfFives++;
            else if(i==10){
                if(noOfFives>=1){
                    noOfFives--;
                    noOfTens++;
                }
                else return false;
            }
            else if(i==20){
                if(noOfTens>=1 && noOfFives>=1){
                    noOfTens--;
                    noOfFives--;
                }
                else if(noOfFives>=3){
                    noOfFives-=3;
                }
                else return false;
            }
        }
        return true;
    }
}