package main.java.com.ohgiraffers.section01.extend;

public class RacingCar extends Car{

    public RacingCar() {
        System.out.println("RacingCar 클래스의 기본 생성자를 호출");
    }

    @Override
    public void run() {
        System.out.println("레이싱카가 전속력으로 질주합니다.");
    }

    @Override
    public void soundHorn() {
        System.out.println("레이싱카는 경적을 울릴 수 없습니다.");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춥니다.");
    }
}
