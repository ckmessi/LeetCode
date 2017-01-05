### 132. Palindrome Partitioning II

Given a string s, partition s such that every substring of the partition is a palindrome.

Return the minimum cuts needed for a palindrome partitioning of s.

For example, given s = "aab",
Return 1 since the palindrome partitioning ["aa","b"] could be produced using 1 cut.

* * *

给定一个字符串，寻找最小分割数。   
需要注意的时，求完回文信息后，找分割数时需要使用动态规划，而不是DFS。


