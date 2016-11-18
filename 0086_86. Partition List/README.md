### 86. Partition List

Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

For example,    
Given 1->4->3->2->5->2 and x = 3,    
return 1->2->2->4->3->5.    

* * *

给定一个链表和一个特殊值x，将求把链表进行一个划分，使得大等于x的结点都在小于x结束的后面，其余顺序保持不变。   
简单的遍历，按值的大小分别放到新的两个链表上。最后合并。即可。   

