package com.example.designpattern.book_headfirst._01_strategy.before;

public class Client {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck("청동오리", 2);
        mallardDuck.fly();
        mallardDuck.quack();

        RedHeadDuck redHeadDuck = new RedHeadDuck("빨머오리", 2);
        redHeadDuck.fly();
        redHeadDuck.quack();

        RubberDuck rubberDuck = new RubberDuck("러버덕", 2);
        rubberDuck.fly(); // 러버덕은 날수 없는데...?
        rubberDuck.quack();
        //아무리 상속한 클래스를 사용하더라도 앞으로 이렇게 나는 동작을 못하는 오리나 나는 방법이 다른 오리들은 모두 fly를 재정의 하게 된다. -> 코드 재사용성 저하 및 유지보수 어려움.
        //또 오리마다 재각기 다른 quack을 재정의 해줘야한다. -> 코드 재사용성 저하 및 유지보수 어려움. -> 또한 부모클래스의 내용과는 다른 fly나 quack을 여러 자식클래스에서 사용하게 될수도 있으므로 코드 중복역시 발생할 수 있다.
        //이게 상속의 큰단점.
        // 이부분을 전략 패턴으로 승화시킴. 즉 바뀌는 부분과 바뀌지 않는 부분을 구분해서 바뀌는 부분만 오려내서 추상화에 의존(컴포지션)하도록 만든다.
    }
}
