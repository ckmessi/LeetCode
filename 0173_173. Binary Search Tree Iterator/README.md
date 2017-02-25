### 173. Binary Search Tree Iterator

Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.

* * *

实现一个BST的迭代器，能够实现迭代输出当前最小的元素。   
要求next()在O(1)时间，hasNext()在O(h)时间，其实就是在hasNext()调用的时候，一次把最小元素准备好，等next()调用即可。   


