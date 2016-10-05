### 46. Permutations

Given a collection of distinct numbers, return all possible permutations.

For example,
[1,2,3] have the following permutations:

	[
	  [1,2,3],
	  [1,3,2],
	  [2,1,3],
	  [2,3,1],
	  [3,1,2],
	  [3,2,1]
	]

* * *

给定一个唯一数字的集合，返回它所有可能的排列。   
使用DFS深搜，每一层可以选取任何一个未被选过的数字，这样就能形成所有的排列。   


