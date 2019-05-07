package by.javatr.orlovski.task_5.exception;

public class NotThreeDigitNumberException extends Exception {

    public NotThreeDigitNumberException() {
        super();
    }

    public NotThreeDigitNumberException(String message) {
        super(message);
    }

    public NotThreeDigitNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotThreeDigitNumberException(Throwable cause) {
        super(cause);
    }
}
