### 287. Find the Duplicate Number

Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

Note:
You must not modify the array (assume the array is read only).
You must use only constant, O(1) extra space.
Your runtime complexity should be less than O(n2).
There is only one duplicate number in the array, but it could be repeated more than once.

* * *

给定一个长度为n+1的数组，只包括1-n的元素值，证明肯定有一个重复元素存在（鸽笼原理）。假定只有一个重复元素，找到这个元素。   

一种办法是变相的二分查找。   

还有一种办法是和找循环链表很像的内容。   


