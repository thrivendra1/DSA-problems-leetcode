class Solution {
    public boolean checkValidString(String s) {
     int low = 0, high = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                low++; 
                high++;
            } else if (c == ')') {
                if (low > 0) low--;
                high--;
            } else { // c == '*'
                if (low > 0) low--;  // Treat '*' as ')'
                high++;              // Treat '*' as '('
            }
            
            if (high < 0) return false;  // Too many ')'
        }
        
        return low == 0;  // Check if all '(' can be closed   
    }
}