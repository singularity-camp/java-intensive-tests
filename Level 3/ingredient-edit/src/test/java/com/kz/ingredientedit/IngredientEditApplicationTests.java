package com.kz.ingredientedit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Not;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class IngredientEditApplicationTests {

	private String[] arr = {"Рис", "Баранина", "Лук", "Масло", "Чеснок", "Морковь", "Красный перец", "Зира", "Соль"};
	private String[] lastArr = {"Рис", "Баранина", "Лук", "Масло", "Чеснок", "Морковь", "Красный перец", "Зира", "Соль"};

	@Test
	@DisplayName("i: 0, v: Укроп")
	void test1() throws NotEqualException {
		String[] target = {"Укроп", "Баранина", "Лук", "Масло", "Чеснок", "Морковь", "Красный перец", "Зира", "Соль"};
		checkForEquals(target, Ingridient.ingredientEdit(arr, 0, "Укроп"));
		arr = lastArr;
	}

	@Test
	@DisplayName("i: 1, v: Морковь")
	void test2() throws NotEqualException {
		String[] target = {"Рис", "Морковь", "Лук", "Масло", "Чеснок", "Морковь", "Красный перец", "Зира", "Соль"};
		checkForEquals(target, Ingridient.ingredientEdit(arr, 1, "Морковь"));
		arr = lastArr;
	}

	@Test
	@DisplayName("i: 5, v: Зира")
	void test3() throws NotEqualException {
		String[] target = {"Рис", "Баранина", "Лук", "Масло", "Чеснок", "Зира", "Красный перец", "Зира", "Соль"};
		checkForEquals(target, Ingridient.ingredientEdit(arr, 5, "Зира"));
		arr = lastArr;
	}

	@Test
	@DisplayName("i: 3, v: Укроп")
	void test4() throws NotEqualException {
		String[] target = {"Рис", "Баранина", "Лук", "Укроп", "Чеснок", "Морковь", "Красный перец", "Зира", "Соль"};
		checkForEquals(target, Ingridient.ingredientEdit(arr, 3, "Укроп"));
		arr = lastArr;
	}

	@Test
	@DisplayName("i: 6, v: Рис")
	void test5() throws NotEqualException {
		String[] target = {"Рис", "Баранина", "Лук", "Масло", "Чеснок", "Морковь", "Рис", "Зира", "Соль"};
		checkForEquals(target, Ingridient.ingredientEdit(arr, 6, "Рис"));
		arr = lastArr;
	}

	@Test
	@DisplayName("i: 3, v: Лук")
	void test6() throws NotEqualException {
		String[] target = {"Рис", "Баранина", "Лук", "Лук", "Чеснок", "Морковь", "Красный перец", "Зира", "Соль"};
		checkForEquals(target, Ingridient.ingredientEdit(arr, 3, "Лук"));
		arr = lastArr;
	}

	@Test
	@DisplayName("i: 1, v: Конина")
	void test7() throws NotEqualException {
		String[] target = {"Рис", "Конина", "Лук", "Масло", "Чеснок", "Морковь", "Красный перец", "Зира", "Соль"};
		checkForEquals(target, Ingridient.ingredientEdit(arr, 1, "Конина"));
		arr = lastArr;
	}

	@Test
	@DisplayName("i: 4, v: Укроп")
	void test() throws NotEqualException {
		String[] target = {"Рис", "Баранина", "Лук", "Масло", "Укроп", "Морковь", "Красный перец", "Зира", "Соль"};
		checkForEquals(target, Ingridient.ingredientEdit(arr, 4, "Укроп"));
		arr = lastArr;
	}
	private void checkForEquals(String[] target, String[] actual) throws NotEqualException {
		if (target.length != actual.length) {
			throw new NotEqualException("Lengths are not equal!");
		}
		for (int i = 0; i < actual.length; ++i) {
			if (actual[i] != target[i]) {
				throw new NotEqualException("\nExpected: " + target[i] + "\nActual: " + actual[i]);
			}
		}
	}
}
