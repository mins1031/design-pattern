package com.example.designpattern.book_headfirst._09_iterator;

import lombok.Getter;

@Getter
public class DinerMenu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];

        addItem("채식주의자용 BLT", "통밀위에 콩고기 베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99);
        addItem("BLT", "통밀위에 베이컨, 상추, 토마토를 얹은 메뉴(이게 뭐지..?)", true, 2.99);
        addItem("오늘의 스프", "감자샐러드를 곁들인 오늘의 스프", true, 3.29);
        addItem("핫도그", "사워크라우트,양념,양파,치즈로 구성", true, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("메뉴꽉참! 추가 못해!");//실전에선 예외로 던져야할듯
        } else {
            this.menuItems[numberOfItems] = menuItem;
            this.numberOfItems++;
        }
    }

    //... 이하로 메뉴리스트 관련된 코드가 굉장히 많다.
}
