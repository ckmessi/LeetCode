### 65. Valid Number

Validate if a given string is numeric.

Some examples:    
"0" => true    
" 0.1 " => true    
"abc" => false    
"1 a" => false    
"2e10" => true    
Note: It is intended for the problem statement to be ambiguous. You should gather all requirements up front before implementing one.    

Update (2015-02-10):    
The signature of the C++ function had been updated. If you still see your function signature accepts a const char * argument, please click the reload button  to reset your code definition.

* * *

判断一个字符串是否是有效的数字。    
我所见过的最优雅的解法是使用正则表达式。    

s1 = "^"	// 起始符号    
s2 = "[+-]?"	// 可选的正负号 
   
s31 = "([0-9]*\\.?[0-9]+)"    
s32 = "([0-9]+\\.?[0-9]*)"    

// s31和s32其实是要覆盖到三种情况，即小数点前和后的数字是(1,1),(1,0),(0,1)的情况，不能都没有，所以要用这两个。    

s4 = "([Ee][+-]?[0-9]+)?"	// 可选的指数部分，整体是可有可无的，但如果有，则肯定有E或e，可选的正负号，然后必须至少有一个数字。    

s5 = "$"	// 结束符号

最后将这5个表达式串联起来：    
String regEx = s1 + s2 + "(" + s31 + "|" + s32 + ")" + s4 + s5

判断s是否匹配regEx即可。    



