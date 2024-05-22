package main.java.com.ohgiraffers.section01.method;

public class Application03 {

    int test = 10;

    public static void main(String[] args){

        /*
        *  변수의 종류
        *
        *  1. 지역 변수
        *  2. 매개 변수
        *  3. 전역 변수 (필드)
        *  4. 클래스(static) 변수
        *
        * */

        Application03 app3 = new Application03();
        app3.testMethod(28);
        // app3.testMethod(20,30);
        // app3.testMethod("40");
        // app3.testMethod();

        // 변수에 저장한 값 전달 테스트
        int age = 20;
        app3.testMethod(age);

        // 자동 형 변환을 이용한 값 전달 테스트
        byte byteAge = 20;
        app3.testMethod(byteAge);

        // 강제 형 변환을 이용한 값 전달 테스트
        long longAge = 30;
        app3.testMethod((int)longAge);

        // 연산 결과를 이용한 값 전달 테스트
        app3.testMethod(byteAge*2);
    }
    public void testMethod(int age){
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
