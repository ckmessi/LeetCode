### 209. Minimum Size Subarray Sum

Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.

For example, given the array [2,3,1,2,4,3] and s = 7,
the subarray [4,3] has the minimal length under the problem constraint.

click to show more practice.

More practice:
If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log n).

* * *

给定一个长度为n的正整数数组，和一个正整数s，找到一个连续子数组，它满足和不小于s，且长度最短。   
最朴素的思想是使用双指针法，向右移直到满足>=s，再移左指针直到不满足，记录当前的数组长度，然后再移右指针，如此反复。   


