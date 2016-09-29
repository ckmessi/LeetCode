### 42. Trapping Rain Water

Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.

For example,     
Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.   


* * *

这是一道很经典的模拟现实题。   
要想能够保持住水，至少需要左右两侧存在柱子比自己高。   
因此思路是先找到中间最高的，然后以它分别作为柱子的一侧，与左边的柱子进行困水，与右边的柱子进行困水。   


