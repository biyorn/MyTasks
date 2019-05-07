package by.javatr.orlovski.task_3.exception;

public class SquareException extends Exception {

    public SquareException() {
        super();
    }

    public SquareException(String message) {
        super(message);
    }

    public SquareException(String message, Throwable cause) {
        super(message, cause);
    }

    public SquareException(Throwable cause) {
        super(cause);
    }
}
