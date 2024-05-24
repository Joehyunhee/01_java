package main.java.com.ohgiraffers.section04.question;

import java.util.Random;

public class Question {
    public static void main(String[] args){

        /*
        *  -100 에서 100 사이의 난수를 발생 시켜서 매개변수로 전달 하면   (0 은 고려 안함)
        *  매개변수가 양수면서 짝수면 x는 양수면서 짝수입니다. 양수면서 홀수면 양수면서 홀수입니다.
        *            음수면서 짝수면 x는 음수면서 짝수입니다. 홀수면 음수면서 홀수입니다.
        *  를 반환하는 메소드를 복습을 위해 다른 패키지에 클래스를 생성해 임포트 시킨 후 메인 메소드에 출력해보자
        *
        * */

        Random random = new Random();
        int num = (int)(random.nextInt(201))-100;


    }
}
