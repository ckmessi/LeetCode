### 78. Subsets

Given a set of distinct integers, nums, return all possible subsets.

Note: The solution set must not contain duplicate subsets.

For example,
If nums = [1,2,3], a solution is:

[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]


* * *

给定一个不重复的数组，返回所有可能的子数组。    
对于非递归的方法，由于每个元素都有选、或不选两种选择，所以共有2^n个选择。可以一个大循环，然后判断当前数字每一位是否为1，如果为1则添加上nums[i]。   

