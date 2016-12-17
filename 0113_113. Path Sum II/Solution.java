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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null){
            return list;
        }
        this.dfsFind(list, new ArrayList<Integer>(), root, sum);
        return list;
    }
    public void dfsFind(List<List<Integer>> list, ArrayList<Integer> current, TreeNode root, int remain){
        if(root.left == null && root.right == null){
            if(root.val == remain){
                current.add(root.val);
                ArrayList<Integer> x = (ArrayList<Integer>)current.clone();
                list.add(x);
                current.remove(current.size() - 1);
            }
            return;
        }
        else if (root.left == null){
            current.add(root.val);
            this.dfsFind(list, current, root.right, remain - root.val);
            current.remove(current.size() - 1);
        }
        else if (root.right == null){
            current.add(root.val);
            this.dfsFind(list, current, root.left, remain - root.val);
            current.remove(current.size() - 1);
        }
        else{
            current.add(root.val);
            this.dfsFind(list, current, root.left, remain - root.val);
            this.dfsFind(list, current, root.right, remain - root.val);
            current.remove(current.size() - 1);
        }
    }
}
