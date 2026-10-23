class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        for(int i = n-1; i>= 0; i--){
            int digit = num.charAt(i) - '0';
            if(digit % 2 != 0){
                int start = 0;

                while(start <= i && num.charAt(start) == '0'){
                    start++;
                }
            
            
            return num.substring(start, i+1);
            }
        }
        return "";
    }
    
}