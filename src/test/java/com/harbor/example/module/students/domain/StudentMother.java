package com.harbor.example.module.students.domain;

import com.harbor.example.module.students.application.StudentResponse;

public final class StudentMother {
    public static Student create(StudentId id, StudentFirstName firstName, StudentLastName lastName, StudentClassesIds classesIds) {
        return new Student(id, firstName, lastName, classesIds);
    }

    public static Student fromResponse(StudentResponse response) {
        return create(
            StudentIdMother.create(response.id()),
            StudentFirstNameMother.create(response.firstName()),
            StudentLastNameMother.create(response.lastName()),
            StudentClassesIdsMother.fromStringList(response.classesIds())
        );
    }

    public static Student random() {
        return create(
            StudentIdMother.random(),
            StudentFirstNameMother.random(),
            StudentLastNameMother.random(),
            StudentClassesIdsMother.random()
        );
    }
}
