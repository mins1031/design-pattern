package com.example.designpattern.lecture_baek._20_state._01_before;

public class Client {
    public static void main(String[] args) {
        Student keesun = new Student("keesun");
        OnlineCourse onlineCourse = new OnlineCourse();

        Student minyoung = new Student("minyoung");
        minyoung.addPrivateCourse(onlineCourse);

        onlineCourse.addStudent(keesun);
        onlineCourse.changeState(OnlineCourse.State.PRIVATE);

        onlineCourse.addStudent(minyoung);

        onlineCourse.addReview("hello", keesun);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
        System.out.println(onlineCourse.getReviews());
    }
}
