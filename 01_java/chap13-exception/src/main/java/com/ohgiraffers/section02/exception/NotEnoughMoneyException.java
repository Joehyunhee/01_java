package main.java.com.ohgiraffers.section02.exception;

public class NotEnoughMoneyException extends Exception{

    public NotEnoughMoneyException() {
    }

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
