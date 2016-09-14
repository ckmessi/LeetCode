### 11. Container With Most Water

Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container.

* * *

这是一道行为模拟题。有很多根柱子，求它们围起的可容纳最多水的容积。   
思路是使用贪心算法，从两侧开始取，然后选取高度较低的一侧进行变化。   


