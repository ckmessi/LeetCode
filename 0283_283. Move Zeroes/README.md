### 283. Move Zeroes

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.

* * *

给定一个数组，写一个函数，将所有的'0'移到数组的最后，同时保持原来非零元素的顺序。   

用一个变量pos表示当前应该被挪动的零的位置，然后遍历数组，通过合理地交换即可。   


