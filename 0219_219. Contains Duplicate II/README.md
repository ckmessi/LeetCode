### 219. Contains Duplicate II

Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

* * *

给定一个数组和一个正整数k，查找是否存在nums[i] == nums[j]并且i与j的差值不大于k。    
方法和系列1很像，只不过这时候用HashMap记录数值发生的位置，再次遇到时直接对比即可。   

