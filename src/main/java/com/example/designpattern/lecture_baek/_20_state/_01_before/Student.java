package com.example.designpattern.lecture_baek._20_state._01_before;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Student {
    private String name;
    private List<OnlineCourse> onlineCourseList;

    public Student(String name) {
        this.name = name;
        this.onlineCourseList = new ArrayList<>();
    }


    public void addPrivateCourse(OnlineCourse onlineCourse) {
        this.onlineCourseList.add(onlineCourse);
    }
}
