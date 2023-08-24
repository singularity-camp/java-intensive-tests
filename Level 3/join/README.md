# join
Реализовать функцию ```join```, которая принимает массивы _array1_ и _array2_. Функция должна объединить оба массива в один и вернуть новый сложившийся.

Запрещено использовать ```Collections.addAll```, ```System.arraycopy```, ```ArrayConcatUtil```, ```Stream```, ```IntStream```, ```ObjectArrays```, ```ArrayList```.

_Дополните функцию join в классе JoinArray что бы решить задачу_

## Пример
```java
int array1[] = {7, 5, 9, 1, 4};
int array2[] = {1, 2, 3, 4, 5};

int new_array[] = join(array1, array2);

for (int i = 0; i < new_array.length; i++) {
    System.out.print(new_array[i] + " ");
}
// Напечатает
// 7 5 9 1 4 1 2 3 4 5
```

## Ограничения
* ```0 <= array1.length <= 10_000```
* ```0 <= array2.length <= 10_000```

### Sample Input

[1, 1]

[1, 1]

### Sample Output
[1, 1, 1, 1]