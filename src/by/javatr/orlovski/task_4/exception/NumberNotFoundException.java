package by.javatr.orlovski.task_4.exception;

public class NumberNotFoundException extends Exception {

    public NumberNotFoundException() {
        super();
    }

    public NumberNotFoundException(String message) {
        super(message);
    }

    public NumberNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NumberNotFoundException(Throwable cause) {
        super(cause);
    }
}
