### 60. Permutation Sequence

The set [1,2,3,…,n] contains a total of n! unique permutations.

By listing and labeling all of the permutations in order,
We get the following sequence (ie, for n = 3):

"123"    
"132"    
"213"    
"231"    
"312"    
"321"    

Given n and k, return the kth permutation sequence.    

Note: Given n will be between 1 and 9 inclusive.

* * *

给定一个正整数n(1 <= n <= 9)，求它的第k个全排列。

一位一位来，当前位置的数，是当前剩余数字中第k / base大的数。   
这题写出来总觉得没那么优雅。
