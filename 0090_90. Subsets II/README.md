### 90. Subsets II

Given a collection of integers that might contain duplicates, nums, return all possible subsets.

Note: The solution set must not contain duplicate subsets.

For example,
If nums = [1,2,2], a solution is:

[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]

* * *

给定一个可能包含重复元素的数组，要求得到它所有可能的子集。   
这个代码思路很巧妙，使用DFS搜索，每次都将当前结果加到是终列表中。   

