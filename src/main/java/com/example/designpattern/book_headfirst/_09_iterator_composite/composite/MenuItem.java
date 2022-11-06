package com.example.designpattern.book_headfirst._09_iterator_composite.composite;

public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public boolean isVegetarian() {
        return this.vegetarian;
    }

    @Override
    public void print() {
        System.out.println("  " + getName());
        if (isVegetarian()) {
            System.out.println("(v)");
        }
        System.out.println(",  " + getPrice());
        System.out.println("    -- " + getDescription());
    }
}
