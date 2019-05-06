package by.javatr.task_6.exception;

public class NegativeTimeException extends Exception {

    public NegativeTimeException() {
        super();
    }

    public NegativeTimeException(String message) {
        super(message);
    }

    public NegativeTimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeTimeException(Throwable cause) {
        super(cause);
    }
}
