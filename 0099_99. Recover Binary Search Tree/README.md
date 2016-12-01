### 99. Recover Binary Search Tree

Two elements of a binary search tree (BST) are swapped by mistake.

Recover the tree without changing its structure.

Note:
A solution using O(n) space is pretty straight forward. Could you devise a constant space solution?
Subscribe to see which companies asked this question

* * *

一棵搜索二叉树有两个节点不小心交换了，尝试恢复它。   
使用DFS深搜，不断记录前一个节点，和当前节点对比，如果错误了则记录下来。最后交换。   

