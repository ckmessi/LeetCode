### 237. Delete Node in a Linked List

Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.

* * *

写一个在单链表中删除节点（非尾节点）的方法，给定当前这个节点的指针。    
这个问题很经典，将使用耍赖方法，把后一个节点的值复制过来，然后把后一个节点删除。    
写得超快，2行语句，不到30秒。    
不过想想都觉得恐怖，比如X要被判处死刑了，X把Y的外貌复制到自己身上，然后把Y杀了，于是自己又能继续活了。   


