package main.java.com.ohgiraffers.section01.method;

public class Application02 {
    public static void main(String[] args){

        System.out.println("main() 메소드 시작됨....");

        Application02 app2 = new Application02();
        app2.methodA();
        app2.methodB();

        System.out.println("main() 메소드 종료됨...");
    }

    public void methodA(){
        System.out.println("methodA() 호출됨...");

        System.out.println("methodA() 종료됨...");
    }

    public void methodB(){
        System.out.println("methodB() 호출됨...");

        System.out.println("methodB() 종료됨...");

    }

}
