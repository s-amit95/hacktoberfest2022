"""
Search in a Binary Search Tree
Algorithms level Medium

Given a binary search tree root and an integer val, determine whether val is in the tree.

Constraints
  n ≤ 100,000 where n is the number of nodes in root

Example 1
  Input:  root = [3, [2, null, null], [9, [7, [4, null, null], [8, null, null]], [12, null, null]]]
          val = 4
  Output: True

Example 2
  Input:  root = [3, [2, null, null], [9, [7, [4, null, null], [8, null, null]], [12, null, null]]]
          val = 100
  Output: False

Url: https://binarysearch.com/problems/Search-in-a-Binary-Search-Tree
"""

# class Tree:
#     def __init__(self, val, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right


class Solution:
    def solve(self, root, val):
        return self.searcher(root, val) > 0

    def searcher(self, root, val):
        if not root:
            return 0
        if root.val == val:
            return 1
        total = 0
        if root.left:
            total += self.searcher(root.left, val)
        if root.right:
            total += self.searcher(root.right, val)
        return total
