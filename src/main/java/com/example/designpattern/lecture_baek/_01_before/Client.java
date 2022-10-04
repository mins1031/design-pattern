package com.example.designpattern.lecture_baek._01_before;

public class Client {

    public static void main(String[] args) {
        Item item1 = new Item("도란검", 450);
        Item item2 = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(item1);
        bag.add(item2);

        Client client = new Client();
        client.printItem(item1);
        client.printPrice(bag);
    }

    private void printItem(Item item) {
        System.out.println(item.getPrice());
    }

    private void printPrice(Bag bag) {
        int totalPrice = bag.getItems().stream()
                .mapToInt(Item::getPrice)
                .sum();
        System.out.println(totalPrice);
    }
}
