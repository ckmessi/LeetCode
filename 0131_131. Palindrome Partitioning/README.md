### 131. Palindrome Partitioning

Given a string s, partition s such that every substring of the partition is a palindrome.

Return all possible palindrome partitioning of s.

For example, given s = "aab",
Return

[
  ["aa","b"],
  ["a","a","b"]
]

* * *

给定一个字符串s，找出所有s的划分，使得每个子串都是一个回文序列。    
分为两个步骤，第一个步骤先计算整个字串的回文信息；第二步根据回文信息，DFS搜索所有可能的划分。
