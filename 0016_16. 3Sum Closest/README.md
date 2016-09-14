### 16. 3Sum Closest

Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

    For example, given array S = {-1 2 1 -4}, and target = 1.

    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

* * *

组定一个数组，找到一个和与目标数最接近的三元组。   
思路是从小到大，固定一个数字，后面采用贪心的双指针方移动。   

