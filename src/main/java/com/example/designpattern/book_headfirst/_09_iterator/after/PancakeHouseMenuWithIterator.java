package com.example.designpattern.book_headfirst._09_iterator.after;

import com.example.designpattern.book_headfirst._09_iterator.MenuItem;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class PancakeHouseMenuWithIterator {
    private List<MenuItem> menuItems;

    public PancakeHouseMenuWithIterator() {
        this.menuItems = new ArrayList<>();

        addItem("팬케이크 세트", "스크램블 + 토스트 = 팬케이크", true, 2.99);
        addItem("레귤러 팬케이크 세트", "계란후라이 + 소시지 가 곁들여진 팬케잌", false, 2.99);
        addItem("블루베리 팬케이크", "블루베리 + 블루베리 시럽으로 만든 팬케잌", true, 3.49);
        addItem("와플", "블루베리나 딸기를 얹을수 있는 와플", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        this.menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(this.menuItems);
    }
    //... 이하로 메뉴리스트 관련된 코드가 굉장히 많다.
}
