package com.example.obrestdatajpa.service;

import com.example.obrestdatajpa.entities.Book;

public class BookPriceCalculator {

    public Double calculatePrice (Book book){
        Double price = book.getPrice();

        if (book.getPages() > 600){
            price += 9.3;
        }
        // envío
        price += 1.99;
        return price;

    }
}
