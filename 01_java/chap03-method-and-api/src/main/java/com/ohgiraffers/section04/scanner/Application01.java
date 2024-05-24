package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args){

        /*
        *  java.util.Scanner
        *  콘솔 화면에 값을 입력 받는 기능을 제공한다.
        *
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력 해주세요 : ");

        String name = sc.nextLine();

        System.out.println("안녕하세요 " + name + "님!");

        System.out.println("나이를 입력하세요 : ");

        int age = sc.nextInt();

        System.out.println("입력하신 나이는 " + age + "세 입니다.");

        System.out.println("원하는 금액을 입력 해주세요 : ");
        long lnum = sc.nextLong();
        System.out.println("입력한 long 타입 금액 : " + lnum);

        System.out.println("원하는 실수를 입력하세요 : ");
        double number = sc.nextDouble();
        System.out.println("입력하신 실수는 " + number + " 입니다.");

        System.out.println("참과 거짓 중에 한 가지를 true 아니면 false 로 입력 해주세요 : ");
        boolean isTrue = sc.nextBoolean();
        System.out.println((isTrue)? "참":"거짓");


        sc.nextLine();

        System.out.println("아무 문자나 입력 해주세요 : ");
        char charValue = sc.nextLine().charAt(0);
        System.out.println(charValue);
    }
}
