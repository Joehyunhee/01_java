package main.java.com.ohgiraffers.section01.method;

public class Application08 {
    public static void main(String[] args){

        /*
        *  static 메소드 호출
        * */

        /*
        *  static 메소드를 호출하는 방법
        *  클래스명.메소드명();
        * */

        System.out.println("10과 20의 합 : " + Application08.sumTwoNumber(10,20));

        System.out.println("20과 30의 합 : " + sumTwoNumber(20,30));

    }
    public static int sumTwoNumber(int num1, int num2){
        return num1+num2;
    }
}
