package com.leetcode.problems.linkedlist;

/**
 * TODO: add description.
 * <p/>
 * NOTE: text
 *
 * @author : dz
 **/
public class RemoveDuplicatesFromSortedListAnd83 {
/*
83. Remove Duplicates from Sorted List
Easy
Topics
Companies
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.



Example 1:
[1]->[1]->[2]
      |
     \ /
    [1]->[2]

Input: head = [1,1,2]
Output: [1,2]


Example 2:
[1]->[1]->[2]->[3]->[3]
      |
     \ /
  [1]->[2]->[3]

Input: head = [1,1,2,3,3]
Output: [1,2,3]


Constraints:

The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.
 */

   public static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }

  public ListNode deleteDuplicates(ListNode head) {
    // Start with the head of the list
    ListNode current = head;

    // Traverse the list
    while (current != null && current.next != null) {
      if (current.val == current.next.val) {
        // Skip the next node if it's a duplicate
        current.next = current.next.next;
      } else {
        // Move to the next node if no duplicate
        current = current.next;
      }
    }

    return head; // Return the head of the modified list
  }

}
