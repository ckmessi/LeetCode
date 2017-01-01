### 128. Longest Consecutive Sequence

Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

For example,
Given [100, 4, 200, 1, 3, 2],
The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

Your algorithm should run in O(n) complexity.

* * *

给定一个无序数组，找到其中包含的最长连续序列。   
在Hulu面试时遇到过这道题目的变种。   
基础是用一个哈希Set记录，每次遇到一个数就开始向两侧搜索，同时更新哈希Set中的内容。   

