### 445. Add Two Numbers II

You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Follow up:
What if you cannot modify the input lists? In other words, reversing the lists is not allowed.

Example:

Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 8 -> 0 -> 7

* * *

给定两个非空链表，表示两个非负整数，最高位在前。将两个链表相加并返回。需要注意的是，不能修改原数组，也就是不能把原数组进行逆转操作。   

自己想出的解法是，先找两条链表的长度，然后先将多出来的那段加好，然后进入共同长度部分相加。   
最后将这个新加出来的链表进行进位的处理，需要逆转、处理、再逆转。   

