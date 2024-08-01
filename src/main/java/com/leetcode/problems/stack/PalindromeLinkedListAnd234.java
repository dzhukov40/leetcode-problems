package com.leetcode.problems.stack;

import java.util.Stack;

/**
 * TODO: add description.
 * <p/>
 * NOTE: text
 *
 * @author : dz
 **/
public class PalindromeLinkedListAnd234 {
/*
234. Palindrome Linked List -> [https://leetcode.com/problems/palindrome-linked-list/description/]
Easy
Topics
Companies
Given the head of a singly linked list, return true if it is a
palindrome or false otherwise.



Example 1:
[1]->[2]->[2]->[1]

Input: head = [1,2,2,1]
Output: true


Example 2:
[1]->[2]

Input: head = [1,2]
Output: false


Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9


Follow up: Could you do it in O(n) time and O(1) space?

 */


  public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public boolean isPalindrome(ListNode head) {
    var stack = new Stack<Integer>();
    var next = head;

    while (next != null) {
      stack.push(next.val);
      next = next.next;
    }

    next = head;
    while (next != null) {
      if (stack.pop() != next.val) {
        return false;
      }
      next = next.next;
    }

    return true;
  }

}
