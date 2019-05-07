package by.javatr.orlovski.task_10.exception;

public class NumberIsNotValidException extends Exception {

    public NumberIsNotValidException() {
        super();
    }

    public NumberIsNotValidException(String message) {
        super(message);
    }

    public NumberIsNotValidException(String message, Throwable cause) {
        super(message, cause);
    }

    public NumberIsNotValidException(Throwable cause) {
        super(cause);
    }
}
