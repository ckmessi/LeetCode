### 33. Search in Rotated Sorted Array

Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.

* * *

给定一个有序数组，但是被旋转过了，找一个特定的值，如果存在返回下标索引，否则返回-1。

二分法的一种应用，可是自己却转不过来。其实就是根据情况除掉一半的元素即可。   

