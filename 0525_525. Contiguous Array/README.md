### 525. Contiguous Array

Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.

Example 1:
Input: [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.
Example 2:
Input: [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.

* * *

给定只包含0和1的数组，找到包含相同数量0和1的连续子项目长度。

遍历一次，统计达到当前地点的累计和，如果此前遇到过相等的，说明这中间一段的0和1数量是相等的。  

