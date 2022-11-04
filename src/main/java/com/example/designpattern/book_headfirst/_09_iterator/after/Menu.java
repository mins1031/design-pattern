package com.example.designpattern.book_headfirst._09_iterator.after;

import com.example.designpattern.book_headfirst._09_iterator.MenuItem;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
