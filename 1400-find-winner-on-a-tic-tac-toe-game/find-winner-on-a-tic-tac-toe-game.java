class Solution {
    public String tictactoe(int[][] moves) {
        if(moves.length<5){
            return "Pending";
        }
        int[] resultCheckArray = new int[8];
        for(int i=moves.length-1;i>=0;i-=2){
                resultCheckArray[moves[i][0]]++;
                resultCheckArray[3+moves[i][1]]++;
                if(moves[i][0]==moves[i][1])
                    resultCheckArray[6]++;
                if(moves[i][0]+moves[i][1]==2)
                    resultCheckArray[7]++;
        }
        for(int i=0;i<resultCheckArray.length;i++){
            if(resultCheckArray[i]==3){
                return (moves.length%2==0?"B":"A");
            }
        }
        if(moves.length==9)return "Draw";
        return "Pending";
        }
    }
