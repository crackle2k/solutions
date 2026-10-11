class Solution {
    public boolean isPalindrome(String s) {
        
        if (s.isEmpty()) { return true; }

        String lower = s.toLowerCase();
        String compare1 = "", compare2 = "";
        for (char letter : lower.toCharArray()) {
            if (letter >= 'a' && letter <= 'z' || letter >= '0' && letter <= '9') {
                compare1 += letter;
            }
        }

        compare2 = new StringBuilder(compare1).reverse().toString();
        
        if (compare1.equals(compare2)) { return true; }
        else { return false; }
    }
}
