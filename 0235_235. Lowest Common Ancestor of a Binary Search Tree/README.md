### 235. Lowest Common Ancestor of a Binary Search Tree

Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”

        _______6______
       /              \
    ___2__          ___8__
   /      \        /      \
   0      _4       7       9
         /  \
         3   5
For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.

* * *

给定一棵二叉搜索数，找到两个给定节点的最低共同祖先。   
根据二叉搜索数的性质，可知如果两个节点的值都比当前节点小，或都比当前节点大，则一定在当前节点的左子树或右子树下，继续递归查找。否则，当前节点就是这两个节点的最低共同祖先。   

