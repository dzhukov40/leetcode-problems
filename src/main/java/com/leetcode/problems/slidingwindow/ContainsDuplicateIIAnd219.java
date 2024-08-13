package com.leetcode.problems.slidingwindow;

import java.util.HashMap;

/**
 * TODO: add description.
 * <p/>
 * NOTE: text
 *
 * @author : dz
 **/
public class ContainsDuplicateIIAnd219 {
/*
219. Contains Duplicate II -> [https://leetcode.com/problems/contains-duplicate-ii/]
Easy
Topics
Companies
Given an integer array nums and an integer k,
return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.



Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false


Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
0 <= k <= 105
 */


  public boolean containsNearbyDuplicate(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();

    // Loop through the array
    for (int i = 0; i < nums.length; i++) {
      // Тут вся магия просто смотрим удовлетворяет ли новое число условиям
      if (map.containsKey(nums[i]) && (i - map.get(nums[i])) <= k) {
        return true;
      }
      // Для нашего задания мы можем переписывать значения так только ближайшие элементы имеют шанс
      map.put(nums[i], i);
    }

    return false;
  }

}
