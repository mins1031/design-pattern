package com.example.designpattern._01_singleton;

public class Setting {

    private static Setting instance;

    private Setting() {
    }
//    }

//  1. private 생성자에 static 메서드 패턴
//
//    public static Setting getInstance() {
//        if (instance == null) {
//            instance = new Setting();
//        }
//    => 쓰레드1과 2가 요청을 했을때 이 구간에서 1이 if를 타서 인스턴스를 생성중에 2가 접근한다면 결국 2 역시 if문을 타게되고 서로 다른 인스턴스
//    2개가 어플리케이션 내에서 동작하며 의도와는 다른 동작을 할 가능성이 있기에 좋은방법이 아님
//
//        return instance;
//    }

//   2. 동기화를 통해 멀티쓰레드에서 안전하게 만드는법
//
//    // synchronized
//    public static synchronized Setting getInstance() {
//        if (instance == null) {
//            instance = new Setting();
//        }
//  => getInstance 메서드를 synchronized 해놓으면 1과 같은 동시접근 문제를 방지할 수 있다. 다만 하나의 스레드가 접근을 마칠때까지 다른 스레드는
//  접근하지 못하기 때문에 성능상 이슈가 생길수 있다.
//        return instance;
//    }

//    3. 싱글톤으로 사용할 인스턴스를 미리 초기화 하는 eager initialization
//  private static final Setting INSTANCE = new Setting();
//    public static Setting getInstance() {
//        return INSTANCE;
//    }
//    클래스가 메모리에 로드될때 미리 한번만 생성되는 장접이 있는 방식이지만 만약 인스턴스 생성비용이 크다면 성능적으로 애매해질수 있는 방법

//    4. 동기화를 통해 멀티쓰레드에서 안전하게 만드는법
//
//    public static Setting getInstance() {
//        if (instance == null) {
//            synchronized (Setting.class) {
//                if (instance == null) {
//                    instance = new Setting();
//                }
//            }
//        }
//    => 동기화 로직을 if 문안에서만 동작하게 하여 동시성 이슈 자체를 예방할 수 있다. 다만 코드량이 많아지고 복잡해진다.
//        return instance;
//    }

//    5. private static inner class에 인스턴스 구현
    private static class SettingHolder {
        private static final Setting SETTING = new Setting();
    }

    public static Setting getInstance() {
        return SettingHolder.SETTING;
    }
    // 이렇게 하면 2,3,4의 장점을 모두 가질수 있다. 처음호출할때 생성하며 동시성 이슈가 나지 않고 코드량도 적다. 다만 여전히 3의 단점인
    // 초기화 성능 이슈는 남아있다.
}
