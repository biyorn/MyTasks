package by.javatr.orlovski.scanner.exception;

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
