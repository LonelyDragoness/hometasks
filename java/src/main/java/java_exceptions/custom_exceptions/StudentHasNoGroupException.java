package java_exceptions.custom_exceptions;

public class StudentHasNoGroupException extends Exception{
    public StudentHasNoGroupException() {
    }

    public StudentHasNoGroupException(String message) {
        super(message);
    }

    public StudentHasNoGroupException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentHasNoGroupException(Throwable cause) {
        super(cause);
    }
}
