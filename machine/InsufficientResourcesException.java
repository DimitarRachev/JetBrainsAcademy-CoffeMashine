package machine;

public class InsufficientResourcesException extends Exception{

    public InsufficientResourcesException(String message) {
        super(message);
    }

    public InsufficientResourcesException(String message, Throwable cause) {
        super(message, cause);
    }

    public InsufficientResourcesException(Throwable cause) {
        super(cause);
    }
}
