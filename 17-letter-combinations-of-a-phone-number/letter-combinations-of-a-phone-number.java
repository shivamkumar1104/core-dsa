class Solution {
    private String[] map = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    public List<String> letterCombinations(String digits){
        List<String> ans = new ArrayList<>();

        if(digits.length() == 0) return ans;

        solve(digits, 0, "", ans);
        return ans;

    }
    private void solve(String digits, int index, String current, List<String> ans){
        if(index == digits.length()){
            ans.add(current);
            return;
        }
    

        String letters = map[digits.charAt(index) - '0'];

        for(char ch : letters.toCharArray()){
            solve(digits, index +1, current +ch, ans);
        }
        
    }
}