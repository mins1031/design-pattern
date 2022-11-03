package com.example.designpattern.book_headfirst._09_iterator;

import com.example.designpattern.book_headfirst._09_iterator.after.AfterWaitress;
import com.example.designpattern.book_headfirst._09_iterator.after.DinerMenuWithIterator;
import com.example.designpattern.book_headfirst._09_iterator.after.PancakeHouseMenuWithIterator;
import com.example.designpattern.book_headfirst._09_iterator.before.DinerMenu;
import com.example.designpattern.book_headfirst._09_iterator.before.PancakeHouseMenu;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        PancakeHouseMenuWithIterator pancakeHouseMenu = new PancakeHouseMenuWithIterator();
        DinerMenuWithIterator dinerMenu = new DinerMenuWithIterator();

        AfterWaitress afterWaitress = new AfterWaitress(pancakeHouseMenu, dinerMenu);

        afterWaitress.printMenu();
    }
}
