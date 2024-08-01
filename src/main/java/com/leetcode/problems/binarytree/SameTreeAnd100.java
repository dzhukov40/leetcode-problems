package com.leetcode.problems.binarytree;

/**
 * TODO: add description.
 * <p/>
 * NOTE: text
 *
 * @author : dz
 **/
public class SameTreeAnd100 {
/*
100. Same Tree -> [https://leetcode.com/problems/same-tree/description/]
Easy
Topics
Companies
Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.



Example 1:
      (1)
      / \
     /   \
   (2)   (3)


Input: p = [1,2,3], q = [1,2,3]
Output: true
Example 2:
      (1)        (1)
      / \        / \
     /   \      /   \
   (2)   (3)  (2)   (3)

Input: p = [1,2], q = [1,null,2]
Output: false
Example 3:
      (1)        (1)
      / \        / \
     /   \      /   \
   (2)   (1)  (1)   (2)

Input: p = [1,2,1], q = [1,1,2]
Output: false


Constraints:

The number of nodes in both trees is in the range [0, 100].
-104 <= Node.val <= 104
 */

  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  public boolean isSameTree(TreeNode left, TreeNode right) {
    if (left == null && right == null) {
      return true;
    }

    if (left == null || right == null) {
      return false;
    }

    if (left.val != right.val) {
      return false;
    }

    return isSameTree(left.left, right.left) && isSameTree(left.right, right.right);
  }


}
