class Solution {
    public String longestCommonPrefix(String[] strs) {
        int smallest=strs[0].length();
        StringBuilder ans = new StringBuilder();
        for (String str : strs) {
            smallest = Math.min(smallest, str.length());
        }
        int i=0;
        while(i<smallest){
            int count = 0 ;
            char a = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) == a) {
                    count++;
                }
            }
            if (count==strs.length){
                ans.append(a);
                i++;
            }
            else break;
        }
        return ans.toString();
    }
}