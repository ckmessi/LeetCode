### 137. Single Number II

Given an array of integers, every element appears three times except for one, which appears exactly once. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

* * *

给定一个数组，除了一个元素外，每个元素都出现三次。找出那个single的元素。   
一个朴素的方法，用一个大小为32的数组记录每一位上的和，不断模3，最终得到的一定是仅有的那个single的。   

