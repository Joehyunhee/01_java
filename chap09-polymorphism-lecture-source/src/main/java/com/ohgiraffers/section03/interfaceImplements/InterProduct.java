package main.java.com.ohgiraffers.section03.interfaceImplements;

public interface InterProduct {
    
    public static final int MAX_NUM= 100;
    int MIN_NUM = 10;
    
    void abstractMethod();
    
    static void staticMethod(){
        System.out.println("InterProduct 클래스의 static method 호출");
    } //재정의할수 없다.
    
    default void defaultMethod(){
        System.out.println("InterProduct 클래스의 default 메소드 호출");
    } //재정의할 수 있다.


//추상메서드는 구현부가 없음.
}
