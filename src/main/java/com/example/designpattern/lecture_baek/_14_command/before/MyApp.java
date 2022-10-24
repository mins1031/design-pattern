package com.example.designpattern.lecture_baek._14_command.before;

public class MyApp {
    //클라이언트 쪽에서의 변경점이 많고 중복코드가 많아질수 있음.
    // 변경점 : 1) 여러 동작이 하고 싶을수 있음. ex 불을 키기, 끄기, 주문하기 등등... 동작에 따라 추가되는 동작이 생길수도 있음.
    // 결국 동작하는 객체와 클라이언트 객체가 강결합 되어있기떄문에 벌어지는 일들이다.
    private LightInBaek light;

    public MyApp(LightInBaek light) {
        this.light = light;
    }

    public void press() {
        light.on();
    }

    public static void main(String[] args) {
        Button button = new Button(new LightInBaek());
        button.press();
        button.press();
        button.press();
    }
}
