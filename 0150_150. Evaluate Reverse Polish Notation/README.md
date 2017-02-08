### 150. Evaluate Reverse Polish Notation

Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each operand may be an integer or another expression.

Some examples:
  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6

* * * 

给定一个逆波兰表达式，计算它的值。
直接按照规则使用一个栈逐步计算即可，没有什么坑。当然，假设表达式是合法的。   


