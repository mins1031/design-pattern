package com.example.designpattern.book_headfirst._09_iterator_composite.iterator.after;

import com.example.designpattern.book_headfirst._09_iterator_composite.iterator.MenuItem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {
    private Map<String, MenuItem> menuItems;

    public CafeMenu() {
        this.menuItems = new HashMap<>();

        addItem("베지 버거와 에어프라이", "재료가 추가된 베지 버거", true, 3.99);
        addItem("오늘의 스프", "샐러드와 함께하는 스프", false, 3.69);
        addItem("부리토", "부리토가 뭐지", true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        this.menuItems.put(name, menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return this.menuItems.values().iterator();
    }
}
