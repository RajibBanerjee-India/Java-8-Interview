package com.rajib.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class StudentImmutable { // Rule 1: Class is final

    // Rule 2: private and final fields
    private final String name;
    private final int age;
    private final List<String> subjects; // Mutable field (List)

    // Rule 5: Initialize via constructor
    public StudentImmutable(String name,
                            int age,
                            List<String> subjects) {
        this.name = name;
        this.age = age;
        // Rule 4: Defensive copy for mutable field
        this.subjects = new ArrayList<>(subjects);
    }

    // Rule 3: No setters

    // For immutable fields, direct return is safe
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Rule 6: Return the unmodifiable list (or a deep copy)
    public List<String> getSubjects() {
        return Collections.unmodifiableList(subjects); // Prevents modification
    }
}
