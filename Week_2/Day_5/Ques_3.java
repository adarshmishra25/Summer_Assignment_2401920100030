
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String ans = "";

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String temp = s.substring(i, j + 1);
                if (isPalindrome(temp) && temp.length() > ans.length()) {
                    ans = temp;
                }
            }
        }
        return ans;
    }

    private static boolean isPalindrome(String p) {
        int left = 0;
        int right = p.length() - 1;

        while (left < right) {
            if (p.charAt(left) != p.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}