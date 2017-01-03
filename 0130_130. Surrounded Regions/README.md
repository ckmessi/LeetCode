### 130. Surrounded Regions

Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.

A region is captured by flipping all 'O's into 'X's in that surrounded region.

For example,
X X X X
X O O X
X X O X
X O X X
After running your function, the board should be:

X X X X
X X X X
X X X X
X O X X

* * * 

给定一个矩阵表示的平面图，把所有被'X'包围的区域都覆盖为'X'。    
其实是一个很简单的搜索题，但是！慎用DFS！慎用DFS！慎用DFS！重说三，每次都因为用了DFS而TLE或者StackOverflow了。    

