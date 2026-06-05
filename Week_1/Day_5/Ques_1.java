class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder n = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                n.append(Character.toLowerCase(c));
            }
        }
        int start = 0, end = n.length() - 1;
        while (start < end) {
            if (n.charAt(start) != n.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}