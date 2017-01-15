### 142. Linked List Cycle II

Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Note: Do not modify the linked list.

Follow up:
Can you solve it without using extra space?

* * *

给定一个链表，查看是否存在环，如果不存在返回null，如果存在返回环开始的地方。   
依然是快慢指针法，在发现有循环后，另外设一个指针从头开始走。画个图就很清楚了。  

