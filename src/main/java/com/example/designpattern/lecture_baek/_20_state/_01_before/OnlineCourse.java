package com.example.designpattern.lecture_baek._20_state._01_before;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class OnlineCourse {
    private State state;
    private List<Student> students;
    private Map<String, Student> reviews;

    public OnlineCourse() {
        this.students = new ArrayList<>();
        this.reviews = new HashMap<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void addReview(String review, Student student) {
        this.reviews.put(review, student);
    }

    public enum State {
        PRIVATE,
        PUBLIC
    }
}
