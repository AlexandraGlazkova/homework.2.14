package pro.sky.homework24;

public class InvalidIndexException extends RuntimeException {
    public InvalidIndexException() {
    }
    public InvalidIndexException(String message) {
        super(message);
    }
}
