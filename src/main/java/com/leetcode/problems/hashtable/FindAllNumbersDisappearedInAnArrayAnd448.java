package com.leetcode.problems.hashtable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * TODO: add description.
 * <p/>
 * NOTE: text
 *
 * @author : dz
 **/
public class FindAllNumbersDisappearedInAnArrayAnd448 {
/*
448. Find All Numbers Disappeared in an Array -> [https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/1353473013/]
Easy
Topics
Companies
Hint
Given an array nums of n integers where nums[i] is in the range [1, n],
return an array of all the integers in the range [1, n] that do not appear in nums.



Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]


Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n


Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 */



  public List<Integer> findDisappearedNumbers(int[] nums) {
    var numsSet = new HashSet<Integer>();

    for (int num : nums) {
      numsSet.add(num);
    }

    var result = new ArrayList<Integer>();

    for (int i = 1; i <= nums.length; i++) {
      if (! numsSet.contains(i)) {
        result.add(i);
      }
    }

    return result;
  }


}
