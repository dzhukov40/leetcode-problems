package com.leetcode.problems.array;

/**
 * TODO: add description.
 * <p/>
 * NOTE: text
 *
 * @author : dz
 **/
public class NextPermutationAnd31 {

/*
31. Next Permutation -> [ https://leetcode.com/problems/next-permutation/ ]
Medium
Topics
Companies
A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3],
the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer.
More formally, if all the permutations of the array are sorted in one container according to their lexicographical order,
then the next permutation of that array is the permutation that follows it in the sorted container.
If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.



Example 1:

Input: nums = [1,2,3]
Output: [1,3,2]
Example 2:

Input: nums = [3,2,1]
Output: [1,2,3]
Example 3:

Input: nums = [1,1,5]
Output: [1,5,1]


Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 100
 */


  /*
    Описание решения: лексический порядок для чисел это какое в результате число мы получаем.
    Получается мы какбы хотим наименьшее возможное число из комбинаций которые остались:
    -> [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1]
        123   <  132    < 213   <    231     <   312   <   321
    ---
    1. каждое число сравнимо и может быть равно боьше или меньше
    2. числа в массиве могут повторятся
    ---
    как получить следующее число?

   */

  public void nextPermutation(int[] nums) {
    int n = nums.length;
    int k = -1;

    // Step 1: Find the largest index k such that nums[k] < nums[k + 1]
    // идем с конца массива и находим число -> 1.4.7 - тут найдем 4 так как число справа выше
    for (int i = n - 1; i > 0; i--) {
      if (nums[i - 1] < nums[i]) {
        k = i - 1;
        break;
      }
    }

    // If no such index exists, the permutation is the last permutation
    if (k == -1) {
      reverse(nums, 0, n - 1);
      return;
    }

    // Step 2: Find the largest index l greater than k such that nums[k] < nums[l]
    int l = -1;
    for (int i = n - 1; i > k; i--) {
      if (nums[i] > nums[k]) {
        l = i;
        break;
      }
    }

    // Step 3: Swap the value of nums[k] with that of nums[l]
    swap(nums, k, l);

    // Step 4: Reverse the sequence from nums[k + 1] to the end
    reverse(nums, k + 1, n - 1);
  }

  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  private void reverse(int[] nums, int start, int end) {
    while (start < end) {
      swap(nums, start, end);
      start++;
      end--;
    }
  }






}
