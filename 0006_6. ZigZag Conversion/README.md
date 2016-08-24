### 6. ZigZag Conversion

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)


	P   A   H   N
	A P L S I I G
	Y   I   R

And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

	string convert(string text, int nRows);

convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".

* * *
将一个字符串按照Zigzag的规则排放后重新组织成新字符串。   
没啥意义，按照规律，每行逐个字符求。第一行和最后一行相差(numRows - 1) \* 2，其余行相差(numRows - i) \* 2和(i - 1) \* 2。

