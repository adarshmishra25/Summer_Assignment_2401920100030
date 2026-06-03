
class Solution {
    public int maxArea(int[] height) {
        int i=0 , j=height.length-1;
        int maxAns = 0 , currAns = 0;
        while(i < j){
            int windowSize = j-i;
            if(height[i] < height[j]) {
                currAns = height[i] * windowSize;
                i++;
            }
            else if(height[j] < height[i]){
                currAns = height[j] * windowSize;
                j--;
            }
            else{
                currAns = height[j] * windowSize;
                i++;
                j--;
            }
            maxAns = Math.max(currAns,maxAns);
        }
        return maxAns;
    }
}