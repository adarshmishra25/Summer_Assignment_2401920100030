
class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inOrder(root,ans);
        List<Integer> temp = new ArrayList<>(ans);
        Collections.sort(temp);
        return ans.equals(temp) && noDuplicates(temp);
    }
    private void inOrder(TreeNode root , List<Integer> ans){
        if(root == null) return;
        inOrder(root.left,ans);
        ans.add(root.val);
        inOrder(root.right,ans);
    }
    private boolean noDuplicates(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i - 1))) return false;
        }
        return true;
    }
}