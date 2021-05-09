package java_exceptions.subjects;

import java_exceptions.interfaces.Subject;

public class RuneWeaving implements Subject {
    public int grade;

    public RuneWeaving(int grade) {
        this.grade = grade;
    }

    @Override
    public int getGrade() {
        return this.grade;
    }

    @Override
    public String getName() {
        return "Rune Weaving";
    }
}
