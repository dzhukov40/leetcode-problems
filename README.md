

# Array
## tips
- (1) начинать цыкл со второго элемента и сматривать текущий элемнт с предыдущем.
- (2) использовать функцию помошник: пенять местами значения в массиве:
```java
  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
```
- (3) использовать ф-ию помошник: реверс порядка элементов в подмассиве
```java
  private void reverse(int[] nums, int start, int end) {
    while (start < end) {
      swap(nums, start, end);
      start++;
      end--;
    }
  }
```

# --------------------------


# Binary tree
## tips
- (1) для рекурсивного обхода надо использовать "аккумулятор"
```java
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
```
- (2) и





