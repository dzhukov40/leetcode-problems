package com.leetcode.problems.greedy;

import java.util.*;

/**
 * TODO: add description.
 * <p/>
 * NOTE: text
 *
 * @author : dz
 **/
public class ThirdMaximumNumberAnd414 {
/*
414. Third Maximum Number -> [https://leetcode.com/problems/third-maximum-number/]
Easy
Topics
Companies
Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.



Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
Example 2:

Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.
Example 3:

Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.


Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1


Follow up: Can you find an O(n) solution?
 */


  public int thirdMax(int[] nums) {
    // Use a TreeSet to store the distinct elements in descending order.
    TreeSet<Integer> distinctNums = new TreeSet<>(Collections.reverseOrder());

    // Add all numbers to the TreeSet, which will automatically handle duplicates.
    for (int num : nums) {
      distinctNums.add(num);
    }

    // Check if there are at least 3 distinct numbers.
    if (distinctNums.size() < 3) {
      // If not, return the maximum number (first element in the TreeSet).
      return distinctNums.first();
    } else {
      // Otherwise, return the third maximum (third element in the TreeSet).
      Iterator<Integer> iterator = distinctNums.iterator();
      iterator.next(); // First maximum
      iterator.next(); // Second maximum
      return iterator.next(); // Third maximum
    }
  }

}
