package com.example.designpattern.book_headfirst._09_iterator.before;

import com.example.designpattern.book_headfirst._09_iterator.MenuItem;

import java.util.List;

public class BeforeWaitress {

    private PancakeHouseMenu pancakeHouseMenu;
    private DinerMenu dinerMenu;

    private List<MenuItem> breakfastItems;
    private MenuItem[] lunchItems;

    public BeforeWaitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.breakfastItems = pancakeHouseMenu.getMenuItems();
        this.lunchItems = dinerMenu.getMenuItems();
    }

    public void printMenu() {
        //종업원의 메뉴 출력 기능
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = breakfastItems.get(i);
            System.out.println(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }

        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem menuItem = lunchItems[i];
            System.out.println(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
    }

    public void printBreakFastMenu() {
        //종업원의 메뉴 출력 기능
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = breakfastItems.get(i);
            System.out.println(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
    }

    public void printLunchMenu() {
        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem menuItem = lunchItems[i];
            System.out.println(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
    }
    //... 메뉴 츌력 방식이 더 필요하면 계속 비슷한 반복코드를 써줘야한다.

}
