### 199. Binary Tree Right Side View

Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

For example:
Given the following binary tree,
   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---
You should return [1, 3, 4].

* * *

给定一棵二叉树，返回每层最右边的节点。   
基本的遍历即可。也可省去保存的空间，使用递归算法，每一层记录最右边的，根据list的长度判断当前层是否已经记录。   

