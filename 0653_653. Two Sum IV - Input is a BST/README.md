### 653. Two Sum IV - Input is a BST

Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.

Example 1:
Input: 
    5
   / \
  3   6
 / \   \
2   4   7

Target = 9

Output: True
Example 2:
Input: 
    5
   / \
  3   6
 / \   \
2   4   7

Target = 28

Output: False


* * *

给定一棵搜索二叉树，要求找到是否有两个节点满足和为某个值。   
按照最朴素的想法，用一个哈希表记录，然后DFS遍历整棵树，访问节点并记录，判断是否存在和为某值的两个数即可。   

还有一种空间复杂度更加优化的算法，之后再记录吧。  

