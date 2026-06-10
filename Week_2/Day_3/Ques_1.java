class Solution {
    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)) return -1;
        for(int i = 0 ; i < haystack.length() - needle.length() + 1 ; i++ ){
            String s = haystack.substring(i,i+needle.length());
            if(s.equals(needle)) return i;
        }
        return -1;
    }
}