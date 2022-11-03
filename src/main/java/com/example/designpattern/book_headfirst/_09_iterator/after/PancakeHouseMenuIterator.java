package com.example.designpattern.book_headfirst._09_iterator.after;

import com.example.designpattern.book_headfirst._09_iterator.MenuItem;
import lombok.Getter;

import java.util.List;

@Getter
public class PancakeHouseMenuIterator implements Iterator {
    private int position = 0;
    private List<MenuItem> menuItems;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }
}
