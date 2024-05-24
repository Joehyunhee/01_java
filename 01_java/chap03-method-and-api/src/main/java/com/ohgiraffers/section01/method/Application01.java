package main.java.com.ohgiraffers.section01.method;

public class Application01 {
    public static void main(String[] args){

        /*
        * 메소드란?
        * 메소드(method) 는 어떤 특정 작업을 수행하기 위한 명령문의 집합이다.
        * */

        System.out.println("main() 메소드 시작됨...");

        Application01 app = new Application01();
        app.methodA();

        System.out.println("main() 메소드 종료됨...");
    }

    public void methodA(){

        System.out.println("methodA() 호출");

        methodB();
        System.out.println("methodA() 종료");

    }

    public void methodB(){

        System.out.println("methodB() 호출");

        System.out.println("methodB() 종료");
    }


}
