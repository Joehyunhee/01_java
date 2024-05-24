package main.java.com.ohgiraffers.section03;

public enum UserRole2 {
    GUEST("게스트"), // 0
    CONSUMER("구매자"), // 1
    PRODUCER("판매자"), // 2
    ADMIN("관리자"); // 3

    private final String description; // 상수열거 타입에 열거외에 필드 넣을 수 있음

//    필드 값을 받을 수 있음
    UserRole2(String description) {
        this.description = description;
    }


//    getter을 넣어서 우리가 값을 받아서 사용할 수 있다.
//    description로 필드값을 지정 : 상수 필드마다 해당내용을 넣고 호출로, 값으로 사용가능

    public String getDescription() {
        return this.description;
    }
}
