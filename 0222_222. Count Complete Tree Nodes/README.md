### 222. Count Complete Tree Nodes

Given a complete binary tree, count the number of nodes.

Definition of a complete binary tree from Wikipedia:
In a complete binary tree every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.

* * *

给定一棵完全二叉树，数出节点的数量。   
根据完全二叉树的定义，只有最后一层可能是不满的。因此可以利用这个性质，快速地求数量。    
方法就是向左向右搜索，如果左右子树的高度相同，就不用一个个算了，直接根据性质求得该节点以下所有的节点数量。如果不同，则需要分别向左右节点去递归地计划子节点数量。   


