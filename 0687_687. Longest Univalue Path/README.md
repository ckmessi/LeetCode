### 687. Longest Univalue Path

Given a binary tree, find the length of the longest path where each node in the path has the same value. This path may or may not pass through the root.

Note: The length of path between two nodes is represented by the number of edges between them.

Example 1:

Input:

              5
             / \
            4   5
           / \   \
          1   1   5
Output:

2
Example 2:

Input:

              1
             / \
            4   5
           / \   \
          4   4   5
Output:

2
Note: The given binary tree has not more than 10000 nodes. The height of the tree is not more than 1000.

* * *

给定一个二叉树，求得树中相同数值节点组成的最长路径。   
主要方式还是深度优先搜索，搜索时需要关注两个概念：当前节点内的最长路径，以及当前根节点向下的最长路径。前者需要用于全局比较，后者需要向上传递判断可能的延伸。   


