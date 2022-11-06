package com.example.designpattern.book_headfirst._09_iterator_composite.iterator;

import com.example.designpattern.book_headfirst._09_iterator_composite.iterator.after.AfterWaitress;
import com.example.designpattern.book_headfirst._09_iterator_composite.iterator.after.AfterDinerMenu;
import com.example.designpattern.book_headfirst._09_iterator_composite.iterator.after.AfterPancakeHouseMenu;
import com.example.designpattern.book_headfirst._09_iterator_composite.iterator.after.CafeMenu;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        AfterPancakeHouseMenu pancakeHouseMenu = new AfterPancakeHouseMenu();
        AfterDinerMenu dinerMenu = new AfterDinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        AfterWaitress afterWaitress = new AfterWaitress(Arrays.asList(pancakeHouseMenu, dinerMenu, cafeMenu));

        afterWaitress.printMenu();
    }
}
