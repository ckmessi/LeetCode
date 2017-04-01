### 224. Basic Calculator

Implement a basic calculator to evaluate a simple expression string.

The expression string may contain open ( and closing parentheses ), the plus + or minus sign -, non-negative integers and empty spaces .

You may assume that the given expression is always valid.

Some examples:
"1 + 1" = 2
" 2-1 + 2 " = 3
"(1+(4+5+2)-3)+(6+8)" = 23
Note: Do not use the eval built-in library function.

* * *

实现一个基本的带加减法括号的计算器。   
根据性质，可以使用一个栈，遇到左括号的时候把之前的内容压栈保存起来，遇到右括号把内容弹出并乘以对应符号。
