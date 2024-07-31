package com.leetcode.problems.array;

/**
 * TODO: add description.
 * <p/>
 * NOTE: text
 *
 * @author : dz
 **/
public class RemoveDuplicatesFromSortedArrayAnd26 {

/*
26. Remove Duplicates from Sorted Array -> [https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/]
Easy
Topics
Companies
Hint
Given an integer array nums sorted in non-decreasing order,
remove the duplicates in-place such that each unique element appears only once.
The relative order of the elements should be kept the same.
Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain
the unique elements in the order they were present in nums initially.
The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.



Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).


Constraints:

1 <= nums.length <= 3 * 104
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.
 */



  /*
    Описание решения:
    сохраняем текущее место вакантное для уникального числа.
    идем по массиву один раз и реагируем где два числа не равны друг другу и стоят рядом
    таким образом мы каждый раз тригеримся на переход из одного числа в другое
    когда находим такие числа можем поместить уникальное число в текущее вакантное место
    и увеличеть счетчик на текущее уникальное место.
   */

  public int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;

    int j = 1; // Pointer for the next unique position

    // Iterate over the array starting from the second element
    for (int i = 1; i < nums.length; i++) {
      // If the current element is different from the previous one
      if (nums[i] != nums[i - 1]) {
        nums[j] = nums[i]; // Move it to the next unique position
        j++; // Increment the unique position pointer
      }
    }

    return j; // The length of the unique elements
  }

  public static void main(String[] args) {
    RemoveDuplicatesFromSortedArrayAnd26 rd = new RemoveDuplicatesFromSortedArrayAnd26();

    int[] nums1 = {1, 1, 2};
    int k1 = rd.removeDuplicates(nums1);
    System.out.println(k1); // Output: 2
    System.out.println(java.util.Arrays.toString(nums1)); // Output: [1, 2, ...]

    int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int k2 = rd.removeDuplicates(nums2);
    System.out.println(k2); // Output: 5
    System.out.println(java.util.Arrays.toString(nums2)); // Output: [0, 1, 2, 3, 4, ...]
  }
}
