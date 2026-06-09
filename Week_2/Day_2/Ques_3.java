
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        findAll(s,p,ans);
        return ans;
    }
    private void findAll( String s , String p , List<Integer> ans){
        if(p.length() > s.length()) return;
        int[] sArr = new int[26];
        int[] pArr = new int[26];
        for(int i = 0 ; i < p.length() ; i++){
            sArr[s.charAt(i) - 'a']++;
            pArr[p.charAt(i) - 'a']++;
        }
        if(matches(sArr,pArr)) ans.add(0);
        for(int i = p.length() ; i < s.length() ; i++){
            sArr[s.charAt(i-p.length()) - 'a']--;
            sArr[s.charAt(i) - 'a']++;
            if(matches(sArr,pArr)) ans.add(i - p.length() +1);            
        }
    }
    private boolean matches(int[] a , int[] b){
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] != b[i]) return false;
        }
        return true;
    }
    
}