# stock-buy
Два друга хотят скинуться, чтобы купить акции на Jusan Invest. Им нужно купить две акции на всю сумму, которая у них есть.

Дается доступная сумма денег _m_ и список цен на различные акции _s_. Напечатайте индексы акции, которые можно купить.

Напечатанные индексы должны быть отсортированы по возрастанию.

Предполагается, что такие числа всегда существуют в списке цен акции _s_, сумма которых равна _m_.

## Пример
```m = 8, s = [8 7 3 1 3 10]```

Правильный ответ

```1 3```

Число по индексу ```[1]``` это 7, а по индексу ```[3]``` это 1. Соответственно, ```7 + 1 = 8```.

## Ограничения
* ```m > 1```
* ```2 <= array.length <= 10_000```

### Sample Input
3

[1, 2, 3]

### Sample Output
0 1