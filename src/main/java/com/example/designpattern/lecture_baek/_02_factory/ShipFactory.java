package com.example.designpattern.lecture_baek._02_factory;

public interface ShipFactory {

    Ship createShip();

    //1. 전과 달라진건 전의 절차지향 코드는 배를 생산하는 로직 자체가 한곳에 있는데 여러가지 종류의 배를 생성할 경우 비슷한 로직이 늘어나게 되어 가독성, 변경에 열려있는 점등의 이유로 좋지 않은 코드였다.
    //2. 해서 코드는 분산된다. 다만 factory 클래스가 아닌 ship안에 구분하는 로직을 만들어도 비슷할거 같간하다.
    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendToEmail(email, ship);
        return ship;
    }

    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배이름도 요청해주세요");
        }

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("주문자의 연락처를 요청해주세요");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + "만들 준비 중");
    }

    private void sendToEmail(String email, Ship ship) {
        System.out.println(ship + "다 만듬");
    }
}
