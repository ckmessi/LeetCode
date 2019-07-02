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

    private final String SEG = ",";
    private final String NULL = "NULL";
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null){
            return NULL;
        }
        StringBuffer sb = new StringBuffer();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode p = stack.pop();
            if(p == null){
                sb.append(NULL);
            }
            else{
                sb.append(p.val);
            }
            sb.append(SEG);
            if(p != null){
                stack.push(p.right);
                stack.push(p.left);
            }
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(data.split(SEG)));
        return deserialize(queue);
    }
    public TreeNode deserialize(Queue<String> queue){
        String cur = queue.poll();
        if(cur.equals(NULL)){
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(cur));
        root.left = deserialize(queue);
        root.right = deserialize(queue);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
