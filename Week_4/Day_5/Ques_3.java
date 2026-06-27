/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Ques_3 {

    public String serialize(TreeNode root) {
        List<String> ans = new ArrayList<>();
        helper(root, ans);
        return String.join(",", ans);
    }

    private void helper(TreeNode root, List<String> ans) {
        if (root == null) {
            ans.add("n");
            return;
        }
        ans.add(String.valueOf(root.val));
        helper(root.left, ans);
        helper(root.right, ans);
    }

    public TreeNode deserialize(String data) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList(data.split(",")));
        return buildTree(list);
    }

    private TreeNode buildTree(LinkedList<String> list) {
        String val = list.removeFirst();

        if (val.equals("n")) return null;

        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = buildTree(list);
        node.right = buildTree(list);

        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));