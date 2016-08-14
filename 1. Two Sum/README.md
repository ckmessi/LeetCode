### 1. Two Sum



Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

**Example**:

	Given nums = [2, 7, 11, 15], target = 9,
	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].


* * *

给定一个数组，返回相加的和能够等于某特殊值的两个数的下标。

使用用哈希表记录数组中所有存在值的下标位置，再次遍历，可在O(n)时间复杂度内检测到对应元素。（题目已约定有且仅有一个解）

* 如果有多个解，如何输出多个解？



