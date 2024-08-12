package com.leetcode.problems.binarysearch;

/**
 * TODO: add description.
 * <p/>
 * NOTE: text
 *
 * @author : dz
 **/
public class SearchInsertPositionAnd35 {
/*
35. Search Insert Position -> https://leetcode.com/problems/search-insert-position/submissions/1353489673/
Easy
Topics
Companies
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4


Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.

 */

  public int searchInsert(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2; // Calculate mid point

      if (nums[mid] == target) {
        return mid; // Target found
      } else if (nums[mid] > target) {
        right = mid - 1; // Search the left half
      } else {
        left = mid + 1; // Search the right half
      }
    }

    // If target is not found, left will be the insertion point
    return left;
  }


  public static void main(String[] args) {
    SearchInsertPositionAnd35 solution = new SearchInsertPositionAnd35();

    int[] nums1 = {1, 3, 5, 6};
    int target1 = 5;
    int target2 = 2;
    int target3 = 7;

    System.out.println("Insert position for target " + target1 + ": " + solution.searchInsert(nums1, target1)); // Output: 2
    System.out.println("Insert position for target " + target2 + ": " + solution.searchInsert(nums1, target2)); // Output: 1
    System.out.println("Insert position for target " + target3 + ": " + solution.searchInsert(nums1, target3)); // Output: 4
  }
}
