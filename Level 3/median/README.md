# median
Реализовать функцию ```median```, которое находится в середине массива, если его упорядочить по возрастанию, то есть такое число, что половина из элементов набора не меньше него, а другая половина не больше.

Если кол-во элементов в массиве четное, то нужно вернуть левое значение медианы.

Если массив пустой, вернуть 0.

_Дополните функцию median в классе ArrayMedian что бы решить задачу_

## Пример
```java
int array[] = {7, 5, 9, 1, 4};
int median_number = median(array);

System.out.println(median_number); // <-- выведет 5
```

## Ограничения
* ```0 <= array.length <= 10_000```

### Sample Input
[1, 2, 3]

### Sample Output
2
