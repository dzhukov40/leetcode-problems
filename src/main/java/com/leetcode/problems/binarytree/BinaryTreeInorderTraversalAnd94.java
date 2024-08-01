package com.leetcode.problems.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: add description.
 * <p/>
 * NOTE: text
 *
 * @author : dz
 **/
public class BinaryTreeInorderTraversalAnd94 {
/*
94. Binary Tree Inorder Traversal -> [https://leetcode.com/problems/binary-tree-inorder-traversal/description/]
Easy
Topics
Companies
Given the root of a binary tree, return the inorder traversal of its nodes' values.



Example 1:
(1)
  \
   \
   (2)
   /
  /
(3)

Input: root = [1,null,2,3]
Output: [1,3,2]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [1]
Output: [1]


Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100


Follow up: Recursive solution is trivial, could you do it iteratively?
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

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    inorderHelper(root, result);
    return result;
  }

  private void inorderHelper(TreeNode node, List<Integer> accumulator) {
    if (node != null) {
      // порядок тут такой чтобы не отсортировано вернуть значения
      inorderHelper(node.left, accumulator);
      accumulator.add(node.val);
      inorderHelper(node.right, accumulator);
    }
  }

  public static void main(String[] args) {
    // Test case 1
    TreeNode root1 = new TreeNode(1);
    root1.right = new TreeNode(2);
    root1.right.left = new TreeNode(3);

    BinaryTreeInorderTraversalAnd94 solution = new BinaryTreeInorderTraversalAnd94();
    System.out.println(solution.inorderTraversal(root1)); // Output: [1, 3, 2]
  }

}
