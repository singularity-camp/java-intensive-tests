# sort
Реализовать функцию ```sort```, которая принимает массив _array_(int[]). Функция должна отсортировать массив по возрастанию.

Подсказка: https://habr.com/ru/post/204600/

Запрещено использовать ```Arrays.sort```.

_Дополните функцию sort в классе ArraySort что бы решить задачу_

## Пример
```java
int array[] = {7, 5, 9, 1, 4};
sort(array);

for (int i = 0; i < array.length; i++) {   
    System.out.print(array[i] + " ");
}
// Напечатает
// 1 4 5 7 9
```

## Ограничения
* ```0 <= array.length <= 10_000```

### Sample Input
[3, 2, 1]

### Sample Output
[1, 2, 3]