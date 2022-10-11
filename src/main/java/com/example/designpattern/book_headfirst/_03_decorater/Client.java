package com.example.designpattern.book_headfirst._03_decorater;

import com.example.designpattern.book_headfirst._03_decorater.beverage.Beverage;
import com.example.designpattern.book_headfirst._03_decorater.beverage.DarkRoast;
import com.example.designpattern.book_headfirst._03_decorater.beverage.Espresso;
import com.example.designpattern.book_headfirst._03_decorater.beverage.HouseBlend;
import com.example.designpattern.book_headfirst._03_decorater.decorator.Mocha;
import com.example.designpattern.book_headfirst._03_decorater.decorator.Soy;
import com.example.designpattern.book_headfirst._03_decorater.decorator.Whip;

public class Client {
    public static void main(String[] args) {
        //CondimentDecorator가 Beverage를 상속받은 이유는 Beverage의 형식(객체지향의 다형성을 최대한 활용하기 위한)을 맞추기 위함이다.
        //행동은 Beverage를 데코레이팅하는 구현 자체가 행동이므로 새로 추가되는 CondimentDecorator가 행동이라고 할 수 있다.
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $ : " + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast); // 모카 추가
        darkRoast = new Mocha(darkRoast); // 모카 추가
        darkRoast = new Whip(darkRoast); // 모카 추가
        System.out.println(darkRoast.getDescription() + " $ : " + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $ : " + houseBlend.cost());

        //데코레이터 패턴은 해당 패턴에 대해 잘 알고 주의사항에 대해 재대로 이해가 된다음에 사용해야 할것 같다는 생각이들었다.
    }
}
