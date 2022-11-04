package com.example.designpattern.book_headfirst._09_iterator;

import com.example.designpattern.book_headfirst._09_iterator.after.AfterWaitress;
import com.example.designpattern.book_headfirst._09_iterator.after.AfterDinerMenu;
import com.example.designpattern.book_headfirst._09_iterator.after.AfterPancakeHouseMenu;

public class Client {

    public static void main(String[] args) {
        AfterPancakeHouseMenu pancakeHouseMenu = new AfterPancakeHouseMenu();
        AfterDinerMenu dinerMenu = new AfterDinerMenu();

        AfterWaitress afterWaitress = new AfterWaitress(pancakeHouseMenu, dinerMenu);

        afterWaitress.printMenu();
    }
}
