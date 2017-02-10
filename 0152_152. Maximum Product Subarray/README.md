### 152. Maximum Product Subarray

Find the contiguous subarray within an array (containing at least one number) which has the largest product.

For example, given the array [2,3,-2,4],
the contiguous subarray [2,3] has the largest product = 6.

* * *

找到一个数组中最大的连续乘积。   
基本思路和连续数组和一样，不同的是要额外保存一个最小数组，因为有可能前面全是负的，一乘变得最大了。   

