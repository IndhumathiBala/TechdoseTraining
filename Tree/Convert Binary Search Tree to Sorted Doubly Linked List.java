/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/

class Solution {
    Node first=null,last=null;
    List<Integer>list=new ArrayList<>();
    public Node treeToDoublyList(Node root) {
        if(root==null)
        return root;
        inorder(root);
        last.right=first;
        first.left=last;
        return first;
    }
    public void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            if(last!=null)
            {
                last.right=root;
                root.left=last;
            }
            else
            {
                first=root;
            }
            last=root;
            inorder(root.right);
        }
    }
}
