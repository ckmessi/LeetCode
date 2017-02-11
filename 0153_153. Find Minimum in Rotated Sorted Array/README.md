### 153. Find Minimum in Rotated Sorted Array

Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.

* * *

给定一个有序递增数组，但在某个节点旋转过的。   
要求找到其中最小的元素。   

这是二分查找的变种题目。其实这个很简单，如果nums[left] < nums[right]，根据递增的性质，可知nums[left]就是最小元素；否则，则想办法不断缩小left和right之间的区间范围。   


