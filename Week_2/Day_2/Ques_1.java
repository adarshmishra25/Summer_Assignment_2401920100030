
import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxC = 0;
        int i = 0, j = 0;
        HashSet<Character> set = new HashSet<>();
        
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (!set.contains(ch)) {
                set.add(ch);
                maxC = Math.max(maxC, set.size());
                i++;
            } else {
                set.remove(s.charAt(j++));
            }
        }
        return maxC;
    }
}