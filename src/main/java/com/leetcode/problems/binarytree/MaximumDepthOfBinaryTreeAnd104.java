package com.leetcode.problems.binarytree;

/**
 * TODO: add description.
 * <p/>
 * NOTE: text
 *
 * @author : dz
 **/
public class MaximumDepthOfBinaryTreeAnd104 {
/*
104. Maximum Depth of Binary Tree -> [https://leetcode.com/problems/maximum-depth-of-binary-tree/description/]
Easy
Topics
Companies
Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.



Example 1:
         (3)
         /  \
        /    \
      (9)   (20)
             / \
            /   \
          (15)  (7)

Input: root = [3,9,20,null,null,15,7]
Output: 3
Example 2:

Input: root = [1,null,2]
Output: 2


Constraints:

The number of nodes in the tree is in the range [0, 104].
-100 <= Node.val <= 100
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

  public int maxDepth(TreeNode root) {
    // If the tree is empty, the maximum depth is 0.
    if (root == null) {
      return 0;
    }

    // Recursively find the maximum depth of the left and right subtrees.
    int leftDepth = maxDepth(root.left);
    int rightDepth = maxDepth(root.right);

    // The maximum depth of the current node is the maximum of the two subtree depths plus one.
    return Math.max(leftDepth, rightDepth) + 1;
  }

  public static void main(String[] args) {
    var solution = new MaximumDepthOfBinaryTreeAnd104();

    // Test case 1
    TreeNode root1 = new TreeNode(1);
    root1.right = new TreeNode(2);
    root1.right.left = new TreeNode(3);

    int result = solution.maxDepth(root1);

    System.out.println("END");
  }

}
