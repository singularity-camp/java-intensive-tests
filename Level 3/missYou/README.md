# miss-you
Дается два массива чисел, вернуть числа из второго массива, которые не присутствуют в первом в отсортированном порядке.

Дополните функцию missYou в классе ArrayMissYou что бы решить задачу

## Пример
```java
int array1[] = {1, 1, 3, 2, 5};
int array2[] = {1, 3, 9, 1, 5, 7};

int miss_numbers[] = missYou(array1, array2);

for (int i = 0; i < miss_numbers.length; i++) {
    System.out.print(miss_numbers[i] + " ");
}
// Напечатает
// 7 9
```

## Ограничения
* ```0 <= array1.length <= 10_000```
* ```0 <= array2.length <= 10_000```

### Sample Input
[1, 1, 3, 2, 5]

[1, 3, 9, 1, 5, 7]

### Sample Output
[7, 9]