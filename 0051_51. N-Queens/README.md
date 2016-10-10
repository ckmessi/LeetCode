### 51. N-Queens

The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.

![](8-queens.png)

Given an integer n, return all distinct solutions to the n-queens puzzle.

Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.

For example,
There exist two distinct solutions to the 4-queens puzzle:

	[    
	 [".Q..",  // Solution 1    
	  "...Q",    
	  "Q...",    
	  "..Q."],    
    
	 ["..Q.",  // Solution 2    
	  "Q...",     
	  "...Q",    
	  ".Q.."]    
	]    

* * *

8皇后问题，要求出所有可能的解。   
想起了当年玩《反三国志》，被白虎棋局困住的几个月。   
基本思路就是深度优先搜索，每一行查找当前可以放置的位置，向后搜索。如果发现失败回溯即可。    



