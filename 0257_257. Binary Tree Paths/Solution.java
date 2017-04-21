/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        if(root == null){
            return list;
        }
        ArrayList<Integer> current = new ArrayList<Integer>();
        current.add(root.val);
        this.dfsFindPath(root, list, current);
        return list;
    }
    
    public void dfsFindPath(TreeNode root, List<String> list, ArrayList<Integer> current){
        if(root.left == null && root.right == null){
            String res = "";
            for(int i = 0; i < current.size(); i++){
                res += current.get(i);
                if(i < current.size() - 1){
                    res += "->";
                }
            }
            list.add(res);
            return;
        }
        else if (root.left == null){
            current.add(root.right.val);
            this.dfsFindPath(root.right, list, current);
            current.remove(current.size() - 1);
        }
        else if (root.right == null){
            current.add(root.left.val);
            this.dfsFindPath(root.left, list, current);
            current.remove(current.size() - 1);
        }
        else{
            current.add(root.right.val);
            this.dfsFindPath(root.right, list, current);
            current.remove(current.size() - 1);
            current.add(root.left.val);
            this.dfsFindPath(root.left, list, current);
            current.remove(current.size() - 1);
        }
    }
}
