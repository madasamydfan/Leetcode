// class Solution {
//     public int myAtoi(String s) {
//         s = s.trim();
//         int sign =1;
//         int result =0;
//         int index =0;
//         if(s.charAt(0)=='-'){sign = -1; index=1;}
//         else if(s.charAt(0)=='+'){sign = 1; index=1;}
//         while(index<s.length()){
//             if(s.charAt(index) >= '0' && s.charAt(index)<='9' ){
//                 result = result * 10 + (s.charAt(index)- '0');
//                 if(result*sign > Integer.MAX_VALUE){
//                     return Integer.MAX_VALUE;
//                 }
//                 if(result*sign < Integer.MIN_VALUE){
//                     return Integer.MIN_VALUE;
//                 }
//             }
//             else{
//                 return result*sign;
//             }
//             index++;
//         }
//         return sign*result;

//     }
// }

class Solution {
    public int myAtoi(String s) {
        s = s.trim(); // Remove leading whitespace
        int sign = 1, i = 0;
        long res = 0; // Using long to handle overflow cases

        if (s.length() == 0) return 0;

        // Check for sign
        if (s.charAt(0) == '-') { sign = -1; i++; }
        else if (s.charAt(0) == '+') { i++; }

        // Process numerical characters
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') break; // Stop at non-numeric character

            res = res * 10 + (ch - '0'); // Convert char to number
            if (sign * res > Integer.MAX_VALUE) return Integer.MAX_VALUE; // Handle overflow
            if (sign * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }
        return (int) (sign * res);
    }
}