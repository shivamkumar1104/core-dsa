class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        
        int n = s.length();
        int left = 0;
        int right = n - 1;
        
        while (left < right) {
            char cLeft = s.charAt(left);
            char cRight = s.charAt(right);
            
            // Agar left character alphanumeric nahi hai, toh aage badho
            if (!Character.isLetterOrDigit(cLeft)) {
                left++;
            } 
            // Agar right character alphanumeric nahi hai, toh peeche aao
            else if (!Character.isLetterOrDigit(cRight)) {
                right--;
            } 
            // Dono valid hain, toh compare karo
            else {
                if (Character.toLowerCase(cLeft) != Character.toLowerCase(cRight)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        
        return true;
    }
}