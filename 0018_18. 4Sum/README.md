### 18. 4Sum

Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

Note: The solution set must not contain duplicate quadruplets.

	For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.

	A solution set is:
	[
	  [-1,  0, 0, 1],
	  [-2, -1, 1, 2],
	  [-2,  0, 0, 2]
	]

* * *

给定一个数组，找出相加和为特定目标值的四元组。   
基本思路和Two Sum，3 Sum很像，就是利用哈希表保存，然后两层遍历查询。   





