### 41. First Missing Positive

Given an unsorted integer array, find the first missing positive integer.

For example,    
Given [1,2,0] return 3,    
and [3,4,-1,1] return 2.    

Your algorithm should run in O(n) time and uses constant space.

* * *

给定一个无序数组，找到最小的不存在的正整数。   
思路比较巧妙，由于只能在O(n)时间内，因此只能遍历一次。由于只能使用固定空间，因此要利用数组本身。    
思路就是，把每个数放置到他对应的位置上，如果超出范围则不处理。这样遍历一次后再遍历一次，找到第一个和它的位置不对应的数，就是首个不存在的正整数。    

