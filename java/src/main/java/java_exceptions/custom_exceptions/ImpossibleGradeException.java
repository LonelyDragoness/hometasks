package java_exceptions.custom_exceptions;

public class ImpossibleGradeException extends Exception {
    public ImpossibleGradeException() {
    }

    public ImpossibleGradeException(String message) {
        super(message);
    }

    public ImpossibleGradeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ImpossibleGradeException(Throwable cause) {
        super(cause);
    }
}
