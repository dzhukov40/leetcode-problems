

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









