package java_exceptions;

import java_exceptions.interfaces.*;

import java.util.ArrayList;

public class Student {
    private String name;
    private String surname;
    private Faculty faculty;
    private Group group;
    private ArrayList<Subject> academicPerformanceList;

    public static class StudentBuilder {
        private final Student newStudent;

        public StudentBuilder () {
            newStudent = new Student();
        }

        public StudentBuilder withName(String name) {
            newStudent.name = name;
            return this;
        }

        public StudentBuilder withSurname(String surname) {
            newStudent.surname = surname;
            return this;
        }

        public StudentBuilder withFaculty(Faculty faculty) {
            newStudent.faculty = faculty;
            return this;
        }

        public StudentBuilder withGroup(Group group) {
            newStudent.group = group;
            return this;
        }

        public StudentBuilder withSubjectList(ArrayList<Subject> academicPerformanceList) {
            newStudent.academicPerformanceList = academicPerformanceList;
            return this;
        }

        public Student build(){
            return newStudent;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }


    public ArrayList<Subject> getAcademicPerformanceList() {
        return academicPerformanceList;
    }

    public void setAcademicPerformanceList(ArrayList<Subject> academicPerformanceList) {
        this.academicPerformanceList = academicPerformanceList;
    }

    @Override
    public String toString() {
        return String.format("name: %s, surname: %s, faculty: %s, group: %s, performance: %s",
                name, surname, faculty, group, academicPerformanceList);
    }
}
