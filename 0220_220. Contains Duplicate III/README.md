### 220. Contains Duplicate III

Given an array of integers, find out whether there are two distinct indices i and j in the array such that the absolute difference between nums[i] and nums[j] is at most t and the absolute difference between i and j is at most k.

* * *

查找是否包含重复元素威力加强版。   
判断是否存在nums[i]和nums[j]，满足它们的值不超过t，且i和j的距离不超过k。   
这次使用的是桶方案。设定宽度为t+1的桶。如果落在同一个桶里，则肯定是重复了。否则检查左右两个桶。   



