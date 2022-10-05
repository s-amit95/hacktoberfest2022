"""
Only Child
Algorithms level Medium

Given a binary tree root, return the number of nodes that are an only child. A node x is an only child if its parent has exactly one child (x).

Constraints
n ≤ 100,000 where n is the number of nodes in root

Example 1
  Input: root = [0, [4, null, null], [2, [1, [3, null, null], null], null]]
  Output: 2
  Explanation: Node 1 is an only child and 3 is an only child.

Example 2
  Input: root = [1, null, [3, [1, null, null], [1, null, null]]]
  Output: 1
  Explanation: Node 3 is an only child.

Url: https://binarysearch.com/problems/Only-Child
"""

# class Tree:
#     def __init__(self, val, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right


class Solution:
    def solve(self, root):
        only_child = {"result": 0}
        mem = []

        def dfs(node):
            if node:
                if node.left and node.right:
                    dfs(node.left)
                    dfs(node.right)
                elif node.left:
                    only_child["result"] += 1
                    dfs(node.left)
                elif node.right:
                    only_child["result"] += 1
                    dfs(node.right)
        dfs(root)
        return only_child["result"]
