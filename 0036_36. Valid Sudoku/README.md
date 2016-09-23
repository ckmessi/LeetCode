### 36. Valid Sudoku

Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

The Sudoku board could be partially filled, where empty cells are filled with the character '.'

* * *

给定一个9*9的二维数组，保存着数独的信息。判断当前数独是否是有效的。   

就根据数独的性质进行判断，每行、每列、每个九宫格不能出现相同的数字，用哈希表进行记录。

