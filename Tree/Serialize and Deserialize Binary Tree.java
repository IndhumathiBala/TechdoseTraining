/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
       public String serialize(TreeNode root) {
        if (root == null) {return "#";}
        String k= root.val + " " + serialize(root.left) + " " + serialize(root.right);
        System.out.println(k);
        return k;
    }

    int pos = -1;
    public TreeNode deserialize(String data) {
        return helper(data.split(" "));
    }
    
    public TreeNode helper(String[] data) {
        pos++;
        if (data[pos].equals("#")) {return null;}
        TreeNode root = new TreeNode(Integer.valueOf(data[pos]));
        root.left = helper(data); root.right = helper(data);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
