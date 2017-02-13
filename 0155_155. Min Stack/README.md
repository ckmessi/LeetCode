### 155. Min Stack

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
Example:
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.

* * *

设计一个支持正常操作的栈，同时能够在常数时间内获取当前最小元素。   
基本思路是使用两个栈，一个是标准的栈执行正常操作，另外一个最小栈的栈顶只保存当前最小元素。    

