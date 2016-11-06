### 74. Search a 2D Matrix

Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.    
The first integer of each row is greater than the last integer of the previous row.    
For example,    

Consider the following matrix:

	[  
	  [1,   3,  5,  7],  
	  [10, 11, 16, 20],   
	  [23, 30, 34, 50]   
	]

Given target = 3, return true.

* * *

给定一个矩阵，每行左从到右递增，每行第一个元素比上一行所有元素都大。   
搜索一个特定的数值。   

两次二分查找。    

