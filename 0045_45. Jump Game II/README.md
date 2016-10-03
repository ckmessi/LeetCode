### 45. Jump Game II

Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

For example:
Given array A = [2,3,1,1,4]

The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3 steps to the last index.)

Note:
You can assume that you can always reach the last index.

* * *

给定每个位置可以跳的距离，判断跳到最后一格最少需要多少步。   
简单的模拟现实题。记录下当前能跳到的最远位置和当前位置，如果超出了当前位置，就再跳一步。   


