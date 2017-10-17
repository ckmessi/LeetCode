### 669. Trim a Binary Search Tree

Given a binary search tree and the lowest and highest boundaries as L and R, trim the tree so that all its elements lies in [L, R] (R >= L). You might need to change the root of the tree, so the result should return the new root of the trimmed binary search tree.

Example 1:
Input: 
    1
   / \
  0   2

  L = 1
  R = 2

Output: 
    1
      \
       2
Example 2:
Input: 
    3
   / \
  0   4
   \
    2
   /
  1

  L = 1
  R = 3

Output: 
      3
     / 
   2   
  /
 1


* * *

给定一棵搜索二叉树，和一个区间范围[L, R]，要求把搜索二叉树中所有不在范围[L, R]的节点都剪除掉，返回剪枝后的二叉树。   

逐个情况考虑即可，若当前节点为null，返回null；若当前节点值小于L，则只需要在右子节点中查找即可；若当前节点值在L和R之间，则分别对左右子节点剪枝后返回；若当前节点值大于R，则只需要在左子节点中查找即可。    
递归地，可写出相关算法。   

