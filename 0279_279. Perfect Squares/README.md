### 279. Perfect Squares

Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, return 2 because 13 = 4 + 9.

* * *

给定一个正整数n，找到最少的完全平方数使得和为n。   
其实就是背包问题，可供选择的物品是所有小于n的完全平方数，重量是其本身数值代表的内容，价值都是1。在重量和固定（等于n）的情况下，要使得价值最小（原背包问题是最大）。    
使用背包问题的变种解法即可。  


