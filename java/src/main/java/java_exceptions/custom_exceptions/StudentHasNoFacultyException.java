package java_exceptions.custom_exceptions;

public class StudentHasNoFacultyException extends Exception {
    public StudentHasNoFacultyException() {
    }

    public StudentHasNoFacultyException(String message) {
        super(message);
    }

    public StudentHasNoFacultyException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentHasNoFacultyException(Throwable cause) {
        super(cause);
    }
}
