package main.java.com.ohgiraffers.section01.method;

public class Application09 {
    public static void main(String[] args){

        /* 다른 클래스에 작성한 메소드 호출 */

        // 최솟값, 최댓값을 비교할 두 정수 선언
        int first = 100;
        int second = 50;

        // non-static 메소드의 경우
        Calculator calc = new Calculator();
        int min = calc.minNumberOf(first,second);
        System.out.println(min);

        // static 메소드인 경우
        int max = Calculator.maxNumberOf(first,second);
        System.out.println(max);

        int max2 = calc.maxNumberOf(first,second);
        System.out.println(max2);
    }
}
