package main.java.com.ohgiraffers.section03.increment;

public class Application01 {
    public static void main(String[] args){

        /*
        *  증감 연산자
        *  ++X , X++ : 앞 또는 뒤에 있는 피 연산자의 값을 1만큼 증가시킨다.
        *  --X, X-- : 앞 또는 뒤에 있는 피 연산자의 값을 1만큼 뺀다.
        * */

        int num = 10;
        int num2 = 20;
        int result = 0;

        result = result * ++num;   // num = num + 1
        System.out.println(result);
        System.out.println("num = " + num);

        result = 1;
        result = result * num++;
        System.out.println(result);
        System.out.println("num = " + num);
    }
}
