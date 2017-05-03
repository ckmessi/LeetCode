### 268. Missing Number

Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?

* * *

给定一个数组，包含n个不同的数字，找到从0开始第一个失踪的数字。   

由于数组长度为n，那从0开始每个数字都有其固定的位置，可通过交换的方法换到对应位置上。然后再遍历一次，不在位置上的就是缺失的元素。   


