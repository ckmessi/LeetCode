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
    public List<TreeNode> generateTrees(int n) {
        List<List<TreeNode>> list = new ArrayList<List<TreeNode>>();
        if(n == 0){
            return new ArrayList<TreeNode>();
        }
        List<TreeNode> tree0 = new ArrayList<TreeNode>();
        tree0.add(null);
        list.add(tree0);
        
        List<TreeNode> tree1 = new ArrayList<TreeNode>();
        tree1.add(new TreeNode(1));
        list.add(tree1);
        
        if(n == 1){
            return tree1;
        }
        
        for(int i = 2; i <= n; i++){
            List<TreeNode> current = new ArrayList<TreeNode>();
            for(int j = 1; j <= i; j++){
                List<TreeNode> leftList = this.generate(list.get(j-1), 0);
                List<TreeNode> rightList = this.generate(list.get(i-j), j);
                for(int q = 0; q < leftList.size(); q++){
                    for(int p = 0; p < rightList.size(); p++){
                        TreeNode root = new TreeNode(j);
                        root.left = leftList.get(q);
                        root.right = rightList.get(p);
                        current.add(root);
                    }
                }
            }
            list.add(current);
        }
        
        return list.get(n);
    }
    public List<TreeNode> generate(List<TreeNode> template, int sizeoff){
        List<TreeNode> list = new ArrayList<TreeNode>();
        for(int i = 0; i < template.size(); i++){
            TreeNode root = this.buildTree(template.get(i), sizeoff);
            list.add(root);
        }
        return list;
    }
    public TreeNode buildTree(TreeNode root, int sizeoff){
        if(root == null){
            return null;
        }
        TreeNode newNode = new TreeNode(root.val + sizeoff);
        newNode.left = this.buildTree(root.left, sizeoff);
        newNode.right = this.buildTree(root.right, sizeoff);
        return newNode;
    }
}
