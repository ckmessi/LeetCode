### 39. Combination Sum

Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

Note:    
- All numbers (including target) will be positive integers.    
- The solution set must not contain duplicate combinations.    

For example, given candidate set [2, 3, 6, 7] and target 7,     
A solution set is:     
	[
  	[7],
  	[2, 2, 3]
	]

* * *

给定一些候选数，和一个目标值，找到所有可能的组合，满足组合的数的和等于目标值，候选数集合中的每个数可以被选择多次。    
简单的DFS深搜查找解决方案。   


