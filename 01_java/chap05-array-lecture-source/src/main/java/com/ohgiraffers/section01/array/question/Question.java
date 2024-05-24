package main.java.com.ohgiraffers.section01.array.question;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        // 배열의 최솟값 , 최댓값 찾기

        // 배열 길이는 스캐너로 입력 받아서 요소마다 정수를 넣어줌.
        // 해당 배열의 최솟값과 최댓값을 출력해주는 기능을 만들어주세요.

        // 배열 길이를 입력 받아 배열 만들기
        Scanner scr = new Scanner(System.in);
        int size = scr.nextInt();

        int[] array = new int[size];


        // 각 인덱스마다 반복문으로 접근해 값 넣어주기
        for (int i = 0; i < size; i++) {
            array[i] = scr.nextInt();
        }

        // max , min 변수를 생성하기
        int max = array[0];
        int min = array[0];
        int secondNum = array[0];

        // 반복문 안에 조건문을 넣어서 큰 값 혹은 작은 값만 남기기
        for (int i = 1; i < size; i++) {
            if(array[i] < min){
                min = array[i];
            }

            if(array[i] > max){
                // array[i] 가 max 보다 클 경우 max 의 값을 second 에 넣어줌
                secondNum = max;
                max = array[i];

                // array[i] 가 max 보다 크지 않고 secondNum 보다 클 경우 secondNum 에 넣어줌. second 랑 max 가 같을때도 실행
                // array[i] 가 second 보다 크고, max랑 같지 않을 경우만 실행  또는 second가 max 랑 같고 array[i]가 max랑 같지 않을 경우만 실행
            } else if ((array[i] > secondNum && array[i] != max) || (secondNum == max && array[i] != max)) {
                secondNum = array[i];
            }
        }

        System.out.println("배열의 최솟값 : " + min);
        System.out.println("배열의 최댓값 : " + max);
        System.out.println("두번째로 큰 값 : " + secondNum);

    }
}
