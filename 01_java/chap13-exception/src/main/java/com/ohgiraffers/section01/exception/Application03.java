package main.java.com.ohgiraffers.section01.exception;

public class Application03 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(5000,1000);
            System.out.println("======= 상품 구입 가능 ======");
        } catch (Exception e) {
            System.out.println("======= 상품 구입 불가 ======");
        }

        System.out.println("프로그램 종료");
    }
}
