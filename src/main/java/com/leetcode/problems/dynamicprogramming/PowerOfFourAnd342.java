package com.leetcode.problems.dynamicprogramming;

import java.util.HashSet;

/**
 * TODO: add description.
 * <p/>
 * NOTE: text
 *
 * @author : dz
 **/
public class PowerOfFourAnd342 {
/*
342. Power of Four -> [https://leetcode.com/problems/power-of-four/submissions/1353447252/]
Easy
Topics
Companies
Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4x.



Example 1:

Input: n = 16
Output: true
Example 2:

Input: n = 5
Output: false
Example 3:

Input: n = 1
Output: true


Constraints:

-231 <= n <= 231 - 1


Follow up: Could you solve it without loops/recursion?
 */


  public boolean isPowerOfFour(int n) {
    if (n <= 0) {
      return false;
    }

    var temp = n;
    while (temp > 1) {
      if (temp % 4 != 0) {
        return false;
      }
      temp /= 4;
    }

    return true;
  }

}
