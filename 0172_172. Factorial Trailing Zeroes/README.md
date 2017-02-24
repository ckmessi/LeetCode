### 172. Factorial Trailing Zeroes

Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.

* * *

给定正整数n，返回n!尾部0的个数。   
其实求0的个数，就是求10的因子数量，而在阶乘中，10=5\*2，即每出现一个5，必然会有一个因子10出现。   
问题可转换为求5的因子个数。这样使用n不断除5得到结果即可。   

