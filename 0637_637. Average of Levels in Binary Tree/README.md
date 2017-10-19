### 637. Average of Levels in Binary Tree

Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.

Example 1:
Input:
    3
   / \
  9  20
    /  \
   15   7
Output: [3, 14.5, 11]
Explanation:
The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
Note:
The range of node's value is in the range of 32-bit signed integer.

* * *

给定一棵非空二叉树，返回每一层的平均值。   
逐层遍历即可。   
有一个坑是数据加起来可能大于int的取值范围，因此用于统计和的变量需要是long类型。  

