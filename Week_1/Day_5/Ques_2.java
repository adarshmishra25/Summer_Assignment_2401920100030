class Solution {
    public void reverseString(char[] s) {
        reverseArr(s,0,s.length-1);
    }
    static void reverseArr(char[] s,int f,int l){
        if(f>=l) return;

        char temp = s[f];
        s[f]=s[l];
        s[l]=temp;

        reverseArr(s,f+1,l-1);
    }
}