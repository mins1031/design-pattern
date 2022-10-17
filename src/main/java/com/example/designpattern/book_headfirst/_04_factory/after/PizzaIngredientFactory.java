package com.example.designpattern.book_headfirst._04_factory.after;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies createVeggies();
    public Pepperoni createPepperoni();
    public Clam createClam();
}
