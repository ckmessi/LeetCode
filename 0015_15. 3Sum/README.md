### 15. 3Sum

Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

	A solution set is:
	[
 	 [-1, 0, 1],
  	 [-1, -1, 2]
	]

* * *

在一个数组中，找出所有满足和为0的三元组。   
思路是使用一个哈希表记录数组中可能存在的所有值，然后用两层循环遍历找出所有可能的结果。   



