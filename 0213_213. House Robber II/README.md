### 213. House Robber II

Note: This is an extension of House Robber.

After robbing those houses on that street, the thief has found himself a new place for his thievery so that he will not get too much attention. This time, all houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, the security system for these houses remain the same as for those in the previous street.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.

* * *

如果House Robber的房子是环形的，即第一个屋子与最后一个屋子是相邻的，求解最大利润。   
此时其实可以划分成两种情况，要么取第一个房子，要么取最后一个房子，总之不能都取。这样取两个dp的最值即可。  

