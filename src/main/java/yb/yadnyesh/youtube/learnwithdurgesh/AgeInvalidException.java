package yb.yadnyesh.youtube.learnwithdurgesh;

public class AgeInvalidException extends Exception {

    AgeInvalidException() {
        super("Age is Invalid");
    }

    AgeInvalidException(String message) {
        super(message);
    }
}
