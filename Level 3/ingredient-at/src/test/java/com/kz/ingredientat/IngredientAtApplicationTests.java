package com.kz.ingredientat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class IngredientAtApplicationTests {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final String[] arr = {"Рис", "Баранина", "Лук", "Масло", "Чеснок", "Морковь", "Красный перец", "Зира", "Соль"};

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    @DisplayName("position = 0")
    void test1() {
        Ingredient.ingredientAt(arr, 0);
        assertEquals("Рис", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("position = 11")
    void test2() {
        Ingredient.ingredientAt(arr, 11);
        assertEquals("", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("position = 3")
    void test3() {
        Ingredient.ingredientAt(arr, 3);
        assertEquals("Масло", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("position = 1")
    void test4() {
        Ingredient.ingredientAt(arr, 1);
        assertEquals("Баранина", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("position = 8")
    void test5() {
        Ingredient.ingredientAt(arr, 8);
        assertEquals("Соль", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("position = 4")
    void test6() {
        Ingredient.ingredientAt(arr, 4);
        assertEquals("Чеснок", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("position = 5")
    void test7() {
        Ingredient.ingredientAt(arr, 5);
        assertEquals("Морковь", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("position = 6")
    void test8() {
        Ingredient.ingredientAt(arr, 6);
        assertEquals("Красный перец", outputStreamCaptor.toString().trim());
    }



}
