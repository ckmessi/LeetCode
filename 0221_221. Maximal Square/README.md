### 221. Maximal Square

Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.

For example, given the following matrix:

1 0 1 0 0
1 0 1 1 1
1 1 1 1 1
1 0 0 1 0
Return 4.

* * *

给定一个2维的二值矩阵，找到最大的全都是1的正方形，并返回它的面积。   
使用简单的动态规划即可，用dp[i][j]表示以(i, j)为右下角的最大正方形边长。它的值是受到dp[i-1][j-1], dp[i-1][j], dp[i][j-1]的制约的。   


