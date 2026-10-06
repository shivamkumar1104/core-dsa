class Solution {
    public int minAddToMakeValid(String s) {
        int res = 0;
        int depth = 0;
        for(char i : s.toCharArray()){
            if(i == '('){
                res++;
            }else{
                if(res > 0){
                    res--;
                }else{
                    depth++;
                }
            
            }
        }
        return res + depth;
    }
}