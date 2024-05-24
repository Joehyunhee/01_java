package main.java.com.ohgiraffers.section04.construct;

public class Application {
    public static void main(String[] args) {


        /*
         *  생성자란?
         *  인스턴스(객체) 를 생성할 때 초기 수행할 명령이 있는 경우 미리 작성해두고. 인스턴스를 생성할 때 호출된다.
         *  생성자 함수에 매개변수가 없는 생성자를 기본생성자, 라고 하며
         *  기본생성자는 compiler에 의해 자동으로 추가되기 때문에 지금까지 명시적으로 작성하지 않고 사용할 수 있었다.
         *
         *
         *  Car car = new Car();
         * */

        // 기본 생성자를 호출해 인스턴스 생성
        User user1 = new User();
        System.out.println(user1.getInfomation());


        // 2가지 매개변수를 받는 생성자를 호출해 인스턴스 생성
        User user2 = new User("user01", "pwd01");
        System.out.println(user2.getInfomation());

        // 모든 필드를 초기화하는 생성자를 호출하여 인스턴스 생성
        User user3 = new User("user02","pass02","이순신",new java.util.Date());
        System.out.println(user3.getInfomation());

    }
}
