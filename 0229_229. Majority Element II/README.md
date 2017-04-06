### 229. Majority Element II

Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times. The algorithm should run in linear time and in O(1) space.

Hint:

How many majority elements could it possibly have?
Do you have a better hint? Suggest it!

* * *

给定一个长度为n的数组，找到所有出现次数大于n/3的元素。    
这种元素最多只可能出现2个，因此只要用两个变量记录。完成后再遍历一次，看看是否真的出现次数大于n/3。    


