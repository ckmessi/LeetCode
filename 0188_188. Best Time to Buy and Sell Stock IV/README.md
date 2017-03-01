### 188. Best Time to Buy and Sell Stock IV

Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete at most k transactions.

Note:
You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).

* * *

买股票的进阶版本。   
看着很难，不确定的k次交易，要求可能的最大利润。    
这题目应该在FreeWheel面试时被问到过。   

首先判断k和prices长度的关系，如果prices.length <= k-1，此时可退化为无限次操作。   

否则，使用一个二维数组dp[k+1][prices.length]来表示动态规划的中间值。其中dp[i][j]表示在前j时间段内，交易i次能得到的最大利润。   
最终要求的是dp[k][prices.length-1]。   
在这种情况下，两层循环外层是k，内层是在给定k情况下的时间段。   
每次k确定时，可以使用一个tempMaxValue变量，表示的是当前循环中（找第i次交易的最大值），已经执行i-1次交易，并已购买某时间股票后的资产余额，即dp[i-1][j-1] - prices[j]的最值。这样，之后的tempMaxValue + prices[j]即是在第j时间卖出股票后资金余额，其最值就是交易i次的所有可能里的最值。   

大概就是这样。
