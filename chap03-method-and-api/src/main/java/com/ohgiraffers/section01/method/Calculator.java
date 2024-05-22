package main.java.com.ohgiraffers.section01.method;

public class Calculator {

    // 둘 중 최솟값을 리턴
    public int minNumberOf(int first, int second){
        return (first > second)? second : first;
    }

    // 둘중 최댓값을 리턴
    public static int maxNumberOf(int first, int second){
        return (first > second)? first : second;
    }
}
