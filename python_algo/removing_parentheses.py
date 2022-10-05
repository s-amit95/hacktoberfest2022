"""
Removing Parentheses
Algorithms level Medium

Given a string of parentheses s, return the minimum number of parentheses to be removed to make the string balanced.

Balanced = Containing no unmatched brackets.
For example, "(())" is balanced, while "(()))" is not.

Constraints
n ≤ 100,000 where n is the length of s


Example 1:
  Input: s = "()())()"
  Output: 1
  Explanation: We can remove the ")" at index 4 to make it balanced.

Example 2
  Input: s = ")("
  Output: 2
  Explanation: We must remove all the parentheses.

Url: https://binarysearch.com/problems/Removing-Parentheses
"""


class Solution:
    def solve(self, s):
        o, c = 0, 0
        for i in s:
            if i == "(":
                o += 1
            else:
                if o > 0:
                    o -= 1
                else:
                    c += 1
        return o + c
