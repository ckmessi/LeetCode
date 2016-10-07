### 47. Permutations II

Given a collection of numbers that might contain duplicates, return all possible unique permutations.

For example,

[1,1,2] have the following unique permutations:
	[
	  [1,1,2],
	  [1,2,1],
	  [2,1,1]
	]

* * *

与题目#46很像，给定一个集合（此时可能包含重复元素），求出所有可能的排列数，要求不包含重复的内容。

思路上还是DFS深搜，在遍历的时候加一个限制。   


