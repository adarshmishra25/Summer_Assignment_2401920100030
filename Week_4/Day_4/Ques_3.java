class Solution {
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        totalSum(root);
        return ans;
    }
    private int totalSum(TreeNode root){
        if(root == null) return 0;
        int left = totalSum(root.left);
        int right = totalSum(root.right);

        left = Math.max(0,left);
        right = Math.max(0,right);

        int pathsum = left + right + root.val;
        ans = Math.max(ans,pathsum);
        return Math.max(left,right)+root.val;
    }
}