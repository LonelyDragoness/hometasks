package java_exceptions.subjects;

import java_exceptions.interfaces.Subject;

public class Alchemy implements Subject {
    public int grade;

    public Alchemy(int grade) {
        this.grade = grade;
    }

    @Override
    public int getGrade() {
        return this.grade;
    }

    @Override
    public String getName() {
        return "Alchemy";
    }
}
