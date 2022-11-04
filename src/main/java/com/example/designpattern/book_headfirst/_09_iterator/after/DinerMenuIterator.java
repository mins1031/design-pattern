package com.example.designpattern.book_headfirst._09_iterator.after;

import com.example.designpattern.book_headfirst._09_iterator.MenuItem;
import lombok.Getter;
import java.util.Iterator;

@Getter
public class DinerMenuIterator implements Iterator {
    private int position = 0;
    private MenuItem[] menuItems;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("메뉴 항목은 지우면 안됩니다.");
    }
}
