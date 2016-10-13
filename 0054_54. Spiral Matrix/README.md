### 54. Spiral Matrix

Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

For example,     
Given the following matrix:

	[    
	 [ 1, 2, 3 ],    
	 [ 4, 5, 6 ],     
	 [ 7, 8, 9 ]     
	]    

You should return [1,2,3,6,9,8,7,4,5].

* * *

基础的模拟现实题。我的方法是给出当前的left,right,top,bottom值，在这个范围内按照顺时针顺序遍历。    


