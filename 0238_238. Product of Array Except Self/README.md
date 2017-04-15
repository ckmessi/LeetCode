### 238. Product of Array Except Self

Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Solve it without division and in O(n).

For example, given [1,2,3,4], return [24,12,8,6].

Follow up:
Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)

* * * 

给定一个长度为n（n > 1）的数组，返回一个数组，这样输出数组output[i]等于除了nums[i]以外的所有元素的乘积。   

在O(n)的时间复杂度内完成。   

最好还能在固定空间复杂度内完成。   

用一个数组记录当前元素左边的乘积，另一个数组记录当前元素右边的乘积。这样就可以动态规划记录，时间复杂度为O(n)。


