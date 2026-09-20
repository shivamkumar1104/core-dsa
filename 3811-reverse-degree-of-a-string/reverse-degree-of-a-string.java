class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i);
            int revIdx = 26 - (ch - 'a');
            int strIdx = i + 1;
            sum  += revIdx * strIdx;
        }
        return sum;
        

    }
}