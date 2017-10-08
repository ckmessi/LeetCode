### 671. Second Minimum Node In a Binary Tree

Given a non-empty special binary tree consisting of nodes with the non-negative value, where each node in this tree has exactly two or zero sub-node. If the node has two sub-nodes, then this node's value is the smaller value among its two sub-nodes.

Given such a binary tree, you need to output the second minimum value in the set made of all the nodes' value in the whole tree.

If no such second minimum value exists, output -1 instead.

Example 1:
Input: 
    2
   / \
  2   5
     / \
    5   7

Output: 5
Explanation: The smallest value is 2, the second smallest value is 5.
Example 2:
Input: 
    2
   / \
  2   2

Output: -1
Explanation: The smallest value is 2, but there isn't any second smallest value.

* * *

给定一棵特殊情况的二叉树，要么没有子节点，要么有两个子节点且当前节点数值是子节点中最小的。要求找出整棵树的第二小元素值。   
还是传递信息的问题，每个子节点需要向上传递两种信息：最小值和次小值，然后当前节点根据子节点的信息进行合并，再向上传递。


