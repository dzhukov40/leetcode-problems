package com.leetcode.problems.greedy;

import java.util.HashMap;

/**
 * TODO: add description.
 * <p/>
 * NOTE: text
 *
 * @author : dz
 **/
public class LongestPalindromeAnd409 {
/*
409. Longest Palindrome -> [https://leetcode.com/problems/longest-palindrome/description/]
Easy
Topics
Companies
Given a string s which consists of lowercase or uppercase letters, return the length of the longest
palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome.



Example 1:

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
Example 2:

Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.


Constraints:

1 <= s.length <= 2000
s consists of lowercase and/or uppercase English letters only.
 */


  public int longestPalindrome(String s) {
    var charCount = new HashMap<Character, Integer>();
    for (char c : s.toCharArray()) {
      charCount.put(c, charCount.getOrDefault(c, 0) + 1);
    }

    int length = 0;
    boolean hasOdd = false;

    for (int count : charCount.values()) {
      if (count % 2 == 0) {
        length += count;
      } else {
        // мы можем использовать не все нечетные символы
        // тоесть есл есть "wwwttttt" мы посчитаем четное число "ww" + "tttt"
        // и в конце сможем только 1 символ в центре полиндрома использовать из нечетных групп
        length += count - 1;
        hasOdd = true;
      }
    }

    if (hasOdd) {
      length += 1;
    }

    return length;
  }

}
