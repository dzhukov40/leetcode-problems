package com.leetcode.problems.stack;

import java.util.ArrayList;
import java.util.Stack;

/**
 * TODO: add description.
 * <p/>
 * NOTE: text
 *
 * @author : dz
 **/
public class ReorderListAnd143 {
/*
143. Reorder List -> [https://leetcode.com/problems/reorder-list/submissions/1354631290/]
Medium
Topics
Companies
You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.


Example 1:
Input: head = [1,2,3,4]
Output: [1,4,2,3]

Example 2:
Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]


Constraints:

The number of nodes in the list is in the range [1, 5 * 104].
1 <= Node.val <= 1000
 */



  public static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public void reorderList(ListNode head) {
    var array = new ArrayList<ListNode>();

    ListNode current = head.next;
    while (current != null) {
      array.add(current);
      current = current.next;
    }

    var leftPointer = 0;
    var rightPointer = array.size() - 1;

    ListNode temp = head;
    while (leftPointer <= rightPointer) {
      temp.next = array.get(rightPointer);
      temp = temp.next;

      if (leftPointer == rightPointer) {
        break;
      }

      temp.next = array.get(leftPointer);
      temp = temp.next;

      rightPointer--;
      leftPointer++;
    }

    temp.next = null;
  }

}
