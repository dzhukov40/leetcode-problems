package com.leetcode.problems.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: add description.
 * <p/>
 * NOTE: text
 *
 * @author : dz
 **/
public class BinaryTreePreorderTraversalAnd144 {
/*
144. Binary Tree Preorder Traversal -> [https://leetcode.com/problems/binary-tree-preorder-traversal/description/]
Easy
Topics
Companies
Given the root of a binary tree, return the preorder traversal of its nodes' values.



Example 1:
         (1)
           \
            \
            (2)
            /
           /
         (3)

Input: root = [1,null,2,3]
Output: [1,2,3]
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


  public List<Integer> preorderTraversal(TreeNode root) {
    var result = new ArrayList<Integer>();

    accumulateValuesInOrder(root, result);

    return result;
  }

  public void accumulateValuesInOrder(TreeNode root,  List<Integer> accumulator) {
    if (root == null) {
      return;
    }

    accumulator.add(root.val);
    accumulateValuesInOrder(root.left, accumulator);
    accumulateValuesInOrder(root.right, accumulator);
  }

}
