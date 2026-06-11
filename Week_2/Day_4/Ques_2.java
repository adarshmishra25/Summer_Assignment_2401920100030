import java.util.*;
class Solution {
    public String decodeString(String s) {
        Stack<Integer> no = new Stack<>();
        Stack<Character> ch = new Stack<>();
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char curr = s.charAt(i);
            if (Character.isDigit(curr)) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                no.push(num);
                continue;
            }
            else if (curr == ']') {
                StringBuilder alph = new StringBuilder();
                while (ch.peek() != '[') {
                    alph.append(ch.pop());
                }
                ch.pop();
                int repeat = no.pop();
                String str = alph.reverse().toString();
                for (int j = 0; j < repeat; j++) {
                    for (char c : str.toCharArray()) {
                        ch.push(c);
                    }
                }
            }
            else {
                ch.push(curr);
            }
            i++;
        }
        while (!ch.isEmpty()) {
            ans.append(ch.pop());
        }
        return ans.reverse().toString();
    }
}