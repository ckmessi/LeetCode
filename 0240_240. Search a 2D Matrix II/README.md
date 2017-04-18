### 240. Search a 2D Matrix II

Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
For example,

Consider the following matrix:

[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
Given target = 5, return true.

Given target = 20, return false.

* * *

给定一个二维矩阵，满足每一行从左到右递增，每一列从上到下递增。在这个矩阵中查找是否存在某特定目标值。   
使用技巧，从右上角开始查找，遇到比特殊值大的值则左移，否则下移，直到移动到边界。   


