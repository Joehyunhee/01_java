package main.java.com.ohgiraffers.section03;

import java.util.EnumSet;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) {

        UserRole1 admin = UserRole1.ADMIN;
        System.out.println(admin);
        System.out.println(admin.getNameToLowerCase());


        UserRole2 consumer = UserRole2.CONSUMER;
        System.out.println(consumer.ordinal() + "" + consumer.name() + "" + consumer.getDescription());
//      ordinal : 상수 번호 (0,1,2,3)/ name : 이름 / description : 필드값
        UserRole2 consumer2 = UserRole2.CONSUMER;

//        앞에 호출하든 뒤에 호출하든 싱글코드로 걸리니깐 이미 static 상속걸려있어서 
        if (consumer2 == consumer) {
            System.out.println("동일비교");
        }

        // EnumSet 을 활용하여 여러 열거형 타입들을 set 으로 취급할 수 있다.
        EnumSet<UserRole2> roles = EnumSet.allOf(UserRole2.class);
        Iterator<UserRole2> iter = roles.iterator();
        // Iterator로 반복문으로 사용가능
        while (iter.hasNext()) {
            System.out.println(iter.next().name());
        }
        // set 문법 한번 공부하고 가기
        // 특정상수만 골라서 set에 추가할 수 있다.
        System.out.println("============================");
        EnumSet<UserRole2> users = EnumSet.of(UserRole2.CONSUMER, UserRole2.PRODUCER);
        Iterator<UserRole2> userIter = users.iterator();
        while (userIter.hasNext()) {
            UserRole2 role = userIter.next();
            System.out.println(role.ordinal() + "" + role.getDescription());
        }

        System.out.println("============================");
        // 특정상수를 제외하여 set에 추가할수 있다.

        EnumSet<UserRole2> notGuest = EnumSet.complementOf((EnumSet.of(UserRole2.GUEST)));
        Iterator<UserRole2> notGuestIter = notGuest.iterator();
        while (notGuestIter.hasNext()) {
            UserRole2 role = notGuestIter.next();
            System.out.println(role.ordinal() + "" + role.getDescription());
        }
    }
}
