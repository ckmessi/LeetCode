### 40. Combination Sum II

Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

Each number in C may only be used once in the combination.

Note:    
- All numbers (including target) will be positive integers.
- The solution set must not contain duplicate combinations.

For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8,     
A solution set is:     

	[
	  [1, 7],
	  [1, 2, 5],
	  [2, 6],
	  [1, 1, 6]
	]

* * *

给定一些候选集和一个目标数，找到所有可能的组合，和为目标数。   
这次的规则是候选集里的每个数最多只能被使用1次。    
还是DFS深度优先查找，不过要注意去重的判断。    


