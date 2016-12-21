### 117. Populating Next Right Pointers in Each Node II

Follow up for problem "Populating Next Right Pointers in Each Node".

What if the given tree could be any binary tree? Would your previous solution still work?

Note:

You may only use constant extra space.
For example,
Given the following binary tree,
         1
       /  \
      2    3
     / \    \
    4   5    7
After calling your function, the tree should look like:
         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \    \
    4-> 5 -> 7 -> NULL

* * *

给定一棵普通二叉树，进行next指针的填充。   
这里需要注意的是，当前层，需要用一个while循环都填满了以后，才能往下走。   
记住啊，这里在VMWare面试的时候混过去了，但其实自己并没有理解透。   

