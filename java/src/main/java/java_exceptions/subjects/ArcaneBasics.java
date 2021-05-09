package java_exceptions.subjects;

import java_exceptions.interfaces.Subject;

public class ArcaneBasics implements Subject {
    public int grade;

    public ArcaneBasics(int grade) {
        this.grade = grade;
    }

    @Override
    public int getGrade() {
        return this.grade;
    }

    @Override
    public String getName() {
        return "Arcane Basics";
    }
}
