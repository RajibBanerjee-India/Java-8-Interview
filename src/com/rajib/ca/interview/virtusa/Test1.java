package com.rajib.ca.interview.virtusa;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {

    public static void main(String[] args) {

        List<Student> listOfStudents = List.of(new Student(2, "Rajib", List.of(Double.valueOf(23), Double.valueOf(56), Double.valueOf(78))),
                new Student(3, "Raj", List.of(Double.valueOf(45), Double.valueOf(67), Double.valueOf(90))),
                new Student(1, "Raju", List.of(Double.valueOf(36), Double.valueOf(89), Double.valueOf(67))));

        List<Integer> ids = listOfStudents.stream()
                .map(Student::getId)
                .collect(Collectors.toList());

        Collections.sort(ids);

        int secondLargest  = ids.get(ids.size() - 2);

        Student student = listOfStudents.stream()
                .filter(tempStudent -> tempStudent.getId() == secondLargest)
                .findFirst().orElse(null);

        System.out.println("Student -> " + student);

        Optional<Student> optionalStudent = Optional.of(new Student(1, "Rajib",
                List.of(23.0, 56.0, 78.0)));

        Optional.ofNullable(null);

        if (optionalStudent.isPresent()) {
            Student student1 = optionalStudent.get();
        }

        // Concise way of doing by using sorted(by comparing with ID), and skip()
        listOfStudents
                .stream()
                .sorted(Comparator.comparing(Student::getId))
                .skip(listOfStudents.size() - 2)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
