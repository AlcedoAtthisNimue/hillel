package lesson16.loginPassword;

public class WrongPasswordException extends Exception{
        public WrongPasswordException(String message) {
            super(message);
        }
}
