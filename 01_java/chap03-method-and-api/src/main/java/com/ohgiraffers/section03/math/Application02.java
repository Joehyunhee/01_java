package main.java.com.ohgiraffers.section03.math;

public class Application02 {
    public static void main(String[] args){

        // 사용자 지정 범위의 난수를 발생 시킬 수 있다.

        // 0~9 까지의 난수 발생
        int random1 = (int)(Math.random()*10);  //  0.xxxxx
        System.out.println("0부터 9 사이의 난수 : " + random1);

        // 1~10 까지의 난수 발생
        int random2 = (int)(Math.random()*10)+1;
        System.out.println("1부터 10 사이의 난수 : " + random2);

        // 10~15 까지의 난수 발생
        int random3 = (int)(Math.random()*6)+10;
        System.out.println("10부터 15 사이의 난수 발생 : " + random3);



    }
}
