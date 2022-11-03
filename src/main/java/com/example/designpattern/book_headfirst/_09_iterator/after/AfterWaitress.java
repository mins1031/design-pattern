package com.example.designpattern.book_headfirst._09_iterator.after;

import com.example.designpattern.book_headfirst._09_iterator.MenuItem;

import java.util.List;

public class AfterWaitress {

    private PancakeHouseMenuWithIterator pancakeHouseMenu;
    private DinerMenuWithIterator dinerMenu;

    public AfterWaitress(PancakeHouseMenuWithIterator pancakeHouseMenu, DinerMenuWithIterator dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        //종업원의 메뉴 출력 기능
        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator dinerMenuIterator = dinerMenu.createIterator();

        System.out.println("메뉴 \n ---- 아침메뉴 ----");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("\n ---- 점심메뉴 ----");
        printMenu(dinerMenuIterator);
    }

    public void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
    //... 메뉴 츌력 방식이 더 필요하면 계속 비슷한 반복코드를 써줘야한다.

}
