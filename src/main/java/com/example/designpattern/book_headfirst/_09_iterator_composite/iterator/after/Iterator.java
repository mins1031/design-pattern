package com.example.designpattern.book_headfirst._09_iterator_composite.iterator.after;

import com.example.designpattern.book_headfirst._09_iterator_composite.iterator.MenuItem;

public interface Iterator {
    public boolean hasNext();
    public MenuItem next();
}
