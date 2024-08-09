package com.leetcode.problems.binarysearch;

import com.leetcode.problems.linkedlist.ReverseLinkedListAnd206;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * TODO: add description.
 * <p/>
 * NOTE: text
 *
 * @author : dz
 **/
public class FirstBadVersionAnd278 {
/*
278. First Bad Version -> [https://leetcode.com/problems/first-bad-version/description/]
Easy
Topics
Companies
You are a product manager and currently leading a team to develop a new product.
Unfortunately, the latest version of your product fails the quality check.
Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad.
Implement a function to find the first bad version. You should minimize the number of calls to the API.



Example 1:

Input: n = 5, bad = 4
Output: 4
Explanation:
call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true
Then 4 is the first bad version.
Example 2:

Input: n = 1, bad = 1
Output: 1


Constraints:

1 <= bad <= n <= 231 - 1
 */

  public int firstBadVersion(int n) {
    int left = 1;
    int right = n;

    // Use binary search to find the first bad version.
    while (left < right) {
      int mid = left + (right - left) / 2;

      // If mid is a bad version, the first bad version is at mid or before mid.
      if (isBadVersion(mid)) {
        right = mid;
      } else {
        // If mid is not bad, then the first bad version must be after mid.
        left = mid + 1;
      }
    }

    // At the end of the loop, left == right, and it points to the first bad version.
    return left;
  }



  public boolean isBadVersion(int version) {
    return true;
  }

  public static void main(String[] args) {
    FirstBadVersionAnd278 solution = new FirstBadVersionAnd278();

    // Test case 1
    solution.firstBadVersion(3);
    System.out.println("END");
  }
}
