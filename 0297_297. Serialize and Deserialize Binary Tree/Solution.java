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
        StringBuffer sb = new StringBuffer("");
        if(root == null){
            return sb.toString();
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        sb.append(root.val);
        while(queue.size() > 0){
            TreeNode node = queue.poll();
            if(node.left != null){
                sb.append("," + node.left.val);
                queue.add(node.left);
            }
            else{
                sb.append("," + " ");
            }
            if(node.right != null){
                sb.append("," + node.right.val);
                queue.add(node.right);
            }
            else{
                sb.append("," + " ");
            }
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("") == true){
            return null;
        }
        String[] tokens = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(tokens[0]));
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int i = 1;
        while(i < tokens.length){
            TreeNode node = queue.poll();
            if(tokens[i].equals(" ") == false){
                int v = Integer.parseInt(tokens[i]);
                node.left = new TreeNode(v);
                queue.add(node.left);
            }
            i++;
            if(tokens[i].equals(" ") == false){
                int v = Integer.parseInt(tokens[i]);
                node.right = new TreeNode(v);
                queue.add(node.right);
            }
            i++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
