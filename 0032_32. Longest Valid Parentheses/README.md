### 32. Longest Valid Parentheses

Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

For "(()", the longest valid parentheses substring is "()", which has length = 2.

Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.

* * *

给定一串只包含'('和')'的字符串，寻找其中最长的有效串的长度。   
学习讨论中一个巧妙的解法，使用栈和一个数组，记录每个位置是否有效，然后再遍历一次求长度。可以在O(n)的时间复杂度内完成。   


