package com.leetcode.problems.binarytree;

/**
 * TODO: add description.
 * <p/>
 * NOTE: text
 *
 * @author : dz
 **/
public class ConvertSortedArrayToBinarySearchTreeAnd108 {
/*
108. Convert Sorted Array to Binary Search Tree -> [https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/]
Easy
Topics
Companies
Given an integer array nums where the elements are sorted in ascending order, convert it to a
height-balanced binary search tree.



Example 1:
         (0)                (0)
         /  \               /  \
        /    \             /    \
      (-3)   (9)   OR    (-10)   (5)
      /      /            \        \
     /      /              \        \
 (-10)    (5)             (-3)      (9)

Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:

Example 2:
      (3)              (1)
      /                  \
     /         OR         \
   (2)                    (3)

Input: nums = [1,3]
Output: [3,1]
Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.


Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in a strictly increasing order.
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

  public TreeNode sortedArrayToBST(int[] nums) {
    if (nums == null || nums.length == 0) {
      return null;
    }
    return helper(nums, 0, nums.length - 1);
  }

  private TreeNode helper(int[] nums, int left, int right) {
    if (left > right) {
      return null;
    }

    // Always choose the middle element to ensure the tree is balanced
    int mid = left + (right - left) / 2;
    TreeNode node = new TreeNode(nums[mid]);

    // Recursively build the left and right subtrees
    node.left = helper(nums, left, mid - 1);
    node.right = helper(nums, mid + 1, right);

    return node;
  }



  public static void main(String[] args) {
    ConvertSortedArrayToBinarySearchTreeAnd108 solution = new ConvertSortedArrayToBinarySearchTreeAnd108();

    // Test case 1
    int[] nums1 = {-10, -3, 0, 5, 9};
    TreeNode tree = solution.sortedArrayToBST(nums1);

    System.out.println("END");
  }

}
