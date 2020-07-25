package Exceptions;

public class UserAleradyExists extends Exception {
    public UserAleradyExists() {
    }

    public UserAleradyExists(String message) {
        super(message);
    }
}
