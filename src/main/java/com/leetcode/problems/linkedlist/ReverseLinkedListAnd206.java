package com.leetcode.problems.linkedlist;

/**
 * TODO: add description.
 * <p/>
 * NOTE: text
 *
 * @author : dz
 **/
public class ReverseLinkedListAnd206 {
/*
206. Reverse Linked List -> [https://leetcode.com/problems/reverse-linked-list/description/]
Easy
Topics
Companies
Given the head of a singly linked list, reverse the list, and return the reversed list.



Example 1:
[1]->[2]->[3]->[4]->[5]
         ||
         \/
[5]->[4]->[3]->[2]->[1]

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]


Example 2:
[1]->[2]
   ||
   \/
[2]->[1]

Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []


Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000
 */

   public static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }

  // мы каждый раз добавляем элемент перед самым первым элементом
  public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode current = head;
    ListNode nextNode;

    while (current != null) {
      nextNode = current.next; // Store next node
      current.next = prev; // Reverse the current node's pointer
      prev = current; // Move prev to current
      current = nextNode; // Move to next node
    }

    return prev; // New head of the reversed list
  }

  public static void main(String[] args) {
    ReverseLinkedListAnd206 solution = new ReverseLinkedListAnd206();

    // Test case 1
    ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
    var result = solution.reverseList(head1);
    System.out.println("END");
  }
}
