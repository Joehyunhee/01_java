package main.java.com.ohgiraffers.section03;

import java.util.function.Consumer;

public enum UserRole1 {
    GUEST,
    Consumer,
    PRODUCER,
    ADMIN;

    // enum은 상수, static필드라서 메모리상에 올라가 있음
    //생성자를 가질 수 있지만 외부에서 호출은 할 수 없다
    UserRole1() {
    }

    // method도 만들 수 있음
    // UserRole1 guset
    public String getNameToLowerCase() {
        return this.name().toLowerCase();
    }


}
