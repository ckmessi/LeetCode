### 230. Kth Smallest Element in a BST

Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

Note: 
You may assume k is always valid, 1 ≤ k ≤ BST's total elements.

Follow up:
What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently? How would you optimize the kthSmallest routine?

Hint:

Try to utilize the property of a BST.
What if you could modify the BST node's structure?
The optimal runtime complexity is O(height of BST).


* * * 

给定一棵搜索二叉树，返回其中第k小的节点。    
由于搜索二叉树的性质，按照深度优先遍历得到的序列第k个元素就是其第k小的节点。因此只要执行DFS搜索过程并计数即可。   


