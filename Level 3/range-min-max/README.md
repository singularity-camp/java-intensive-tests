# range-min-max
Реализовать функцию ```range_min_max```, которая принимает массив _array_(int[]), числа _min_ и _max_. Функция должна вернуть массив из элементов _array_, где каждый элемент больше _min_ включительно и меньше _max_ включительно.

_Дополните функцию rangeMinMax в классе MinMax что бы решить задачу_

## Пример
```java
int array[] = {7, 5, 9, 1, 4};
int[] new_array = rangeMinMax(array, 3, 5);

for (int i = 0; i < new_array.length; i++) {   
    System.out.print(new_array[i] + " ");
}
// Напечатает
// 5 4 
```

## Ограничения
* ```0 <= array.length <= 10_000```

### Sample Input
[3, 2, 1]

0 1

### Sample Output
[1]