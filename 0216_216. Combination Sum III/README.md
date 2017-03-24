### 216. Combination Sum III

Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.


Example 1:

Input: k = 3, n = 7

Output:

[[1,2,4]]

Example 2:

Input: k = 3, n = 9

Output:

[[1,2,6], [1,3,5], [2,3,4]]

* * *

给定参数k和n，找到所有k个数字的组合，使得数字和为n的所有可能。   
数字只能从1到9。
简单的深度优先搜索即可。   

