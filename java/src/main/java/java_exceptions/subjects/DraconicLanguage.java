package java_exceptions.subjects;

import java_exceptions.interfaces.Subject;

public class DraconicLanguage implements Subject {
    public int grade;

    public DraconicLanguage(int grade) {
        this.grade = grade;
    }

    @Override
    public int getGrade() {
        return this.grade;
    }

    @Override
    public String getName() {
        return "Draconic Language";
    }
}
