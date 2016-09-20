### 34. Search for a Range

Given a sorted array of integers, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

For example,    
Given [5, 7, 7, 8, 8, 10] and target value 8,    
return [3, 4].    

* * *

给定一个有序数组，找到一个特定数值的开始和结束位置，如果不存在返回[-1,-1]。

使用两次二分查找即可，思路很简单，但是真要把它们写好却不容易。写的时候记住不是去找那特定的一半，而是排除不可能的一半。    
   


