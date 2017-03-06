### 200. Number of Islands

Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example 1:

11110
11010
11000
00000
Answer: 1

Example 2:

11000
11000
00100
00011
Answer: 3

* * * 

给定一个二维的平面地图，用1和0分别表示陆地和海洋。求总共有多少块小岛。   
简单的DFS深度优先搜索，找到一个1就把它连着的一片都找出来，只计数增加一。最后看有多少个计数。   

