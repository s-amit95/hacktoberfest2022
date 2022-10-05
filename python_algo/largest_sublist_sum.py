"""
Largest Sublist Sum
Algorithms level Medium

Given a list of integers nums, return the sum of a non-empty contiguous sublist with the largest sum.

Constraints
1 ≤ n ≤ 100,000 where n is the length of nums

Example 1
  Input: nums = [10, -5, 12, -100, 3, -1, 20]
  Output: 22
  Explanation: [3, -1, 20] is the contiguous sublist with the largest sum.

Example 2
  Input: nums = [3, 4, -2, 5]
  Output: 10
  Explanation: We can take the whole list and its sum is 3 + 4 - 2 + 5 = 10

Url: https://binarysearch.com/problems/Largest-Sublist-Sum
"""


class Solution:
    def solve(self, nums):

        maxSum, sumNum = nums[0], 0
        r = 0
        while r < len(nums):
            sumNum += nums[r]
            maxSum = max(sumNum, maxSum)
            if sumNum < 0:
                sumNum = 0
            r += 1
        return maxSum
