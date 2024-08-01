package com.leetcode.problems.twopointers;

/**
 * TODO: add description.
 * <p/>
 * NOTE: text
 *
 * @author : dz
 **/
public class MergeSortedArrayAnd88 {
/*
88. Merge Sorted Array -> [https://leetcode.com/problems/merge-sorted-array/]
Easy
Topics
Companies
Hint
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
and the last n elements are set to 0 and should be ignored. nums2 has a length of n.



Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.


Constraints:

nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[j] <= 109


Follow up: Can you come up with an algorithm that runs in O(m + n) time?
 */


  public void merge(int[] nums1, int m, int[] nums2, int n) {
    // Start merging from the end of both arrays
    int firstIndex = m - 1; // Last index of nums1
    int secondIndex = n - 1; // Last index of nums2


    for (int i = m + n - 1; i >= 0; i--) {
      if (firstIndex < 0) {
        nums1[i] = nums2[secondIndex];
        secondIndex--;
        continue;
      }

      if (secondIndex < 0) {
        nums1[i] = nums1[firstIndex];
        firstIndex--;
        continue;
      }

      if (nums1[firstIndex] >= nums2[secondIndex]) {
        nums1[i] = nums1[firstIndex];
        firstIndex--;
      } else {
        nums1[i] = nums2[secondIndex];
        secondIndex--;
      }
    }
  }

  public static void main(String[] args) {
    MergeSortedArrayAnd88 solution = new MergeSortedArrayAnd88();

    // Test case 1
//    int[] nums1_1 = {1, 2, 3, 0, 0, 0};
//    int[] nums2_1 = {2, 5, 6};
//    solution.merge(nums1_1, 3, nums2_1, 3);
//    System.out.println(nums1_1);

    // Test case 2
    int[] numsT1 = new int[]{0};
    int[] numsT2 = new int[]{1};
    solution.merge(numsT1, 0, numsT2, 1);
    System.out.println(numsT1);
  }

}
