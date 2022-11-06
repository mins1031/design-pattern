package com.example.designpattern.book_headfirst._09_iterator_composite.iterator.after;

import com.example.designpattern.book_headfirst._09_iterator_composite.iterator.MenuItem;
import java.util.Iterator;
import java.util.List;


public class AfterWaitress {
    private List<Menu> menus;

    public AfterWaitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        //종업원의 메뉴 출력 기능
        Iterator<Menu> iterator = menus.iterator();
        while (iterator.hasNext()) {
            Menu menu = iterator.next();
            printMenu(menu.createIterator());
        }
    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

    public void printMenu(Iterable<MenuItem> iterable) {
        for (MenuItem menuItem : iterable) {
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
