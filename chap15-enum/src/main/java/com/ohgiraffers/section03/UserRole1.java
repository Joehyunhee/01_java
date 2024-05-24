package main.java.com.ohgiraffers.section03;

import java.util.function.Consumer;

public enum UserRole1 {
    GUSET,
    Consumer,
    PRODUCER,
    ADMIN;

    UserRole1() {
    }

    public String getNameToLowerCase() {
        return this.name();
    }
}
