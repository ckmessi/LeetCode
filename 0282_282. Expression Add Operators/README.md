### 282. Expression Add Operators

Given a string that contains only digits 0-9 and a target value, return all possibilities to add binary operators (not unary) +, -, or * between the digits so they evaluate to the target value.

Examples: 
"123", 6 -> ["1+2+3", "1*2*3"] 
"232", 8 -> ["2*3+2", "2+3*2"]
"105", 5 -> ["1*0+5","10-5"]
"00", 0 -> ["0+0", "0-0", "0*0"]
"3456237490", 9191 -> []


* * *

给定一个字符串，只包含数字0-9。要求在所有可能的位置增加符号+、-或*，使得公式的算术结果等于特定目标值。   

使用深度优先搜索，三种可能路径。注意当前数值和preValue的选择即可。   

