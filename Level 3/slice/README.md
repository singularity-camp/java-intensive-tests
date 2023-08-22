# slice
Реализовать функцию ```slice```, которая принимает массив _array_(int[]), числа _from_ и _to_. Функция должна вернуть элементы массива _array_ от индекса _from_ (включая _from_) и до _to_.

_Дополните функцию slice в классе SliceArray что бы решить задачу._

## Пример
```java
int array[] = {7, 5, 9, 1, 4};
int[] new_array = slice(array, 0, 4);

for (int i = 0; i < new_array.length; i++) {   
    System.out.print(new_array[i] + " ");
}
// Напечатает
// 7 5 9 1 
```

## Ограничения
* ```0 <= array.length <= 10_000```
* ```0 <= from, to <= 10_000```
* ```from < to```

### Sample Input
[3, 2, 1]

0 1

### Sample Output
[3]