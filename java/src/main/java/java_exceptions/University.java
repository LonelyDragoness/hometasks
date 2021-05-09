package java_exceptions;

import java_exceptions.custom_exceptions.*;
import java_exceptions.faculties.*;
import java_exceptions.groups.*;
import java_exceptions.interfaces.Subject;
import java_exceptions.subjects.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class University {
    public static void main(String[] args) throws ImpossibleGradeException, UniversityHasNoFacultiesException,
            StudentHasNoFacultyException, FacultyHasNoGroupsException, StudentHasNoGroupException,
            StudentHasNoSubjectsException {

        UniversityOperations studentList = new UniversityOperations();

        studentList.addStudent(new Student.StudentBuilder()
                .withName("Jane")
                .withSurname("Wulf")
                .withFaculty(new ElementalMagic())
                .withGroup(new Alpha())
                .withSubjectList(new ArrayList<> (Arrays.asList(
                    new ArcaneBasics(10),
                    new DraconicLanguage(9),
                    new RuneWeaving(10))))
                .build());
        studentList.addStudent(new Student.StudentBuilder()
                .withName("Daniel")
                .withSurname("Moore")
                .withFaculty(new ElementalMagic())
                .withGroup(new Alpha())
                .withSubjectList(new ArrayList<> (Arrays.asList(
                        new ArcaneBasics(7),
                        new DraconicLanguage(8),
                        new RuneWeaving(10))))
                .build());
        studentList.addStudent(new Student.StudentBuilder()
                .withName("Sarah")
                .withSurname("Harris")
                .withFaculty(new ElementalMagic())
                .withGroup(new Alpha())
                .withSubjectList(new ArrayList<> (Arrays.asList(
                        new ArcaneBasics(9),
                        new DraconicLanguage(8),
                        new RuneWeaving(7))))
                .build());
        studentList.addStudent(new Student.StudentBuilder()
                .withName("Mark")
                .withSurname("Thompson")
                .withFaculty(new ElementalMagic())
                .withGroup(new Beta())
                .withSubjectList(new ArrayList<> (Arrays.asList(
                        new ArcaneBasics(8),
                        new DraconicLanguage(6),
                        new RuneWeaving(4))))
                .build());
        studentList.addStudent(new Student.StudentBuilder()
                .withName("Margaret")
                .withSurname("Taylor")
                .withFaculty(new ElementalMagic())
                .withGroup(new Beta())
                .withSubjectList(new ArrayList<> (Arrays.asList(
                        new ArcaneBasics(5),
                        new DraconicLanguage(10),
                        new RuneWeaving(6))))
                .build());
        studentList.addStudent(new Student.StudentBuilder()
                .withName("Kenneth")
                .withSurname("Lee")
                .withFaculty(new ElementalMagic())
                .withGroup(new Beta())
                .withSubjectList(new ArrayList<> (Arrays.asList(
                        new ArcaneBasics(4),
                        new DraconicLanguage(4),
                        new RuneWeaving(4))))
                .build());
        studentList.addStudent(new Student.StudentBuilder()
                .withName("Chloe")
                .withSurname("Ross")
                .withFaculty(new Transmutation())
                .withGroup(new Omega())
                .withSubjectList(new ArrayList<> (Arrays.asList(
                        new ArcaneBasics(8),
                        new DraconicLanguage(9),
                        new Alchemy(10))))
                .build());
        studentList.addStudent(new Student.StudentBuilder()
                .withName("Kevin")
                .withSurname("Walker")
                .withFaculty(new Transmutation())
                .withGroup(new Omega())
                .withSubjectList(new ArrayList<> (Arrays.asList(
                        new ArcaneBasics(7),
                        new DraconicLanguage(10),
                        new Alchemy(9))))
                .build());
        studentList.addStudent(new Student.StudentBuilder()
                .withName("Ashley")
                .withSurname("Green")
                .withFaculty(new Transmutation())
                .withGroup(new Psi())
                .withSubjectList(new ArrayList<> (Arrays.asList(
                        new ArcaneBasics(10),
                        new DraconicLanguage(7),
                        new Alchemy(9))))
                .build());
        studentList.addStudent(new Student.StudentBuilder()
                .withName("Amanda")
                .withSurname("Baker")
                .withFaculty(new Transmutation())
                .withGroup(new Psi())
                .withSubjectList(new ArrayList<> (Arrays.asList(
                        new ArcaneBasics(6),
                        new DraconicLanguage(8),
                        new Alchemy(6))))
                .build());
        studentList.addStudent(new Student.StudentBuilder()
                .withName("Ryan")
                .withSurname("Mitchell")
                .withFaculty(new Divination())
                .withGroup(new Rho())
                .withSubjectList(new ArrayList<> (Arrays.asList(
                        new ArcaneBasics(10),
                        new Alchemy(9),
                        new RuneWeaving(6))))
                .build());
        studentList.addStudent(new Student.StudentBuilder()
                .withName("Angela")
                .withSurname("Torres")
                .withFaculty(new Divination())
                .withGroup(new Rho())
                .withSubjectList(new ArrayList<> (Arrays.asList(
                        new ArcaneBasics(8),
                        new Alchemy(7),
                        new RuneWeaving(9))))
                .build());
        studentList.addStudent(new Student.StudentBuilder()
                .withName("Brandon")
                .withSurname("Hill")
                .withFaculty(new Divination())
                .withGroup(new Sigma())
                .withSubjectList(new ArrayList<> (Arrays.asList(
                        new ArcaneBasics(5),
                        new Alchemy(7),
                        new RuneWeaving(10))))
                .build());
        studentList.addStudent(new Student.StudentBuilder()
                .withName("Anna")
                .withSurname("Martinez")
                .withFaculty(new Divination())
                .withGroup(new Sigma())
                .withSubjectList(new ArrayList<> (Arrays.asList(
                        new ArcaneBasics(6),
                        new Alchemy(9),
                        new RuneWeaving(8))))
                .build());

        studentList.universityHasFacultiesStructure();
        studentList.facultiesHaveGroupsAndStudentSaturation();
        studentList.studentsHaveSubjects();
        studentList.studentsHaveGradesInProperRange();

        System.out.println("Average grade in all subjects of the student \"Jane Wulf\":\n" +
                studentList.getStudentAverageScore(0));
        System.out.println("Group Alpha average grade in \"Arcane Basics\":\n" +
                studentList.getAverageSubjectScoreForGroup("Alpha", "Arcane Basics"));
        System.out.println("Faculty of Elemental Magic grade point average in \"Arcane Basics\":\n" +
                studentList.getFacultyGradePointForSubject("Elemental Magic", "Arcane Basics"));
        System.out.println("Average grade across the university for the subject \"Rune Weaving\":\n"
                + studentList.getAverageGradeAcrossTheUniversityForSpecificSubject("Rune Weaving"));
    }

    static class UniversityOperations {
        List<Student> studentList = new ArrayList<>();

        public void addStudent(Student student) {
            studentList.add(student);
        }

        public float getStudentAverageScore(int studentNumber) {
            float score = 0;
            int amountOfSubjects = 0;
            Student testingStudent = studentList.get(studentNumber);

            for (Subject subject : testingStudent.getAcademicPerformanceList()) {
                score += subject.getGrade();
                amountOfSubjects++;
            }
            return score / amountOfSubjects;
        }

        public float getAverageSubjectScoreForGroup(String group, String subjectName) {
            float score = 0;
            int amountOfStudents = 0;

            for (Student student : studentList) {
                if (student.getGroup().getName().equals(group)) {
                    for (Subject subject : student.getAcademicPerformanceList()) {
                        if (subject.getName().equals(subjectName)) {
                            score += subject.getGrade();
                            amountOfStudents++;
                        }
                    }
                }
            }
            return score / amountOfStudents;
        }

        public float getFacultyGradePointForSubject(String facultyName, String subjectName) {
            float score = 0;
            int amountOfStudents = 0;

            for (Student student : studentList) {
                if (student.getFaculty().getName().equals(facultyName)) {
                    for (Subject subject : student.getAcademicPerformanceList()) {
                        if (subject.getName().equals(subjectName)) {
                            score += subject.getGrade();
                            amountOfStudents++;
                        }
                    }
                }
            }
            return score / amountOfStudents;
        }

        public float getAverageGradeAcrossTheUniversityForSpecificSubject(String subjectName) {
            float score = 0;
            int amountOfStudents = 0;

            for (Student student : studentList) {
                for (Subject subject : student.getAcademicPerformanceList()) {
                    if (subject.getName().equals(subjectName)) {
                        score += subject.getGrade();
                        amountOfStudents++;
                    }
                }
            }
            return score/amountOfStudents;
        }

        public void universityHasFacultiesStructure() throws UniversityHasNoFacultiesException,
                StudentHasNoFacultyException {
            int amountOfFaculties = 0;

            for (Student student : studentList) {
                if (student.getFaculty() != null) {
                    amountOfFaculties++;
                }
            }
            if (amountOfFaculties == 0) {
                System.err.println("University has no faculties.");
                throw new  UniversityHasNoFacultiesException("University should have at least one faculty.");
            }
            for (Student student : studentList) {
                if (student.getFaculty() == null) {
                    System.err.println("Student " + student.getName() + " " + student.getSurname()
                            + " has no faculty.");
                    throw new StudentHasNoFacultyException("Every student should have a faculty.");
                }
            }
        }

        public void facultiesHaveGroupsAndStudentSaturation() throws FacultyHasNoGroupsException,
                StudentHasNoGroupException {
            List<String> facultyList = new ArrayList<>();

            for (Student student : studentList) {
                facultyList.add(student.getFaculty().getName());
            }

            for (String faculty : facultyList) {
                int testingFacultyGroupAmount = 0;
                int amountOfStudentsOnTheFaculty = 0;
                String studentWithoutGroup = "";

                for (Student student : studentList) {
                    if (student.getFaculty().getName().equals(faculty)) {
                        amountOfStudentsOnTheFaculty++;
                        if (student.getGroup() != null) {
                            testingFacultyGroupAmount++;
                        } else {
                            studentWithoutGroup = student.getName() + " " + student.getSurname();
                        }
                    }
                }

                if (amountOfStudentsOnTheFaculty != testingFacultyGroupAmount) {
                    if (testingFacultyGroupAmount == 0) {
                        System.err.println("Faculty " + faculty + " has no groups.");
                        throw new FacultyHasNoGroupsException("Faculty should have at least one group.");
                    } else {
                        System.err.println("Student " + studentWithoutGroup + " has no group.");
                        throw new StudentHasNoGroupException("Student should always have a group.");
                    }
                }
            }
        }

        public void studentsHaveSubjects() throws StudentHasNoSubjectsException {
            for (Student student : studentList) {
                if (student.getAcademicPerformanceList() == null) {
                    System.err.println("Student " + student.getName() + " " + student.getSurname() +
                            " doesn't have a single subject.");
                    throw new StudentHasNoSubjectsException("Student should have at least one subject.");
                }
            }
        }

        public void studentsHaveGradesInProperRange() throws ImpossibleGradeException {
            for (Student student : studentList) {
                for (Subject subject : student.getAcademicPerformanceList()) {
                    if (subject.getGrade() < 0 || subject.getGrade() > 10) {
                        System.err.println("Student " + student.getName() + " " + student.getSurname() + " has "
                                + subject.getGrade() + " in " + subject.getName() + ".");
                        throw new ImpossibleGradeException("Student grades must range from 0 to 10.");
                    }
                }
            }
        }
    }
}
