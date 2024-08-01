

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
- (3) ф-ия помошник: реверс порядка элементов в подмассиве
```java
  private void reverse(int[] nums, int start, int end) {
    while (start < end) {
      swap(nums, start, end);
      start++;
      end--;
    }
  }
```
- (4) ф-ия помошник: получить центральный элемент в подмассиве или (* )левый из двух в центре
```java
  private int getMidlElementIndex(int[] nums, int start, int end) {
    return start + (end - start) / 2;
  }
```
- (5) если надо вмержить один массив в другой, вмерживаем с конца есл там свободные места

# --------------------------


# Binary tree
## tips
- (1) для рекурсивного обхода надо использовать "аккумулятор"
```java
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
- (2) Для написание рекурсии важно определить конец рекурсии



# --------------------------


# Linked list
## tips
- (1) ф-ия помошник: инвертируем односвязанный список
```java
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
```







