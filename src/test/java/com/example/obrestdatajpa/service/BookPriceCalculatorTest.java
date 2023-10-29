package com.example.obrestdatajpa.service;

import com.example.obrestdatajpa.entities.Book;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BookPriceCalculatorTest {

    @Test
    void calculatePrice() {

        // Configuración de la prueba
        Book book = new Book(1L,
                "La historia de Kento Nanami",
                "Hitokiri Battosai",
                987,
                58.76,
                LocalDate.now(),
                true);
        BookPriceCalculator calculator = new BookPriceCalculator();

        // Se ejecuta el comportamiento a testear
        Double price = calculator.calculatePrice(book);
        System.out.println(price);

        // Comprobaciones aserciones
        assertTrue(price > 0);
        assertEquals(70.05, price);
    }
}