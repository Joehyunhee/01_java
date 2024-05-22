package main.java.com.ohgiraffers.section01.extend;

public class Car {

    private boolean runningStatus;

    public Car(){
        System.out.println("car 클래스의 기본 생성자 호출");
    }

    public void run(){
        // 달리는 기능
        runningStatus = true;
        System.out.println("자동차가 달립니다.");
    }

    public boolean isRunning(){
        // 주행상태 반환 기능
        return runningStatus;
    }

    public void soundHorn(){
        // 주행중일 때 경적 울리는 기능
        if (isRunning()) {
            System.out.println("빵빵~~~~");
        }else{
            System.out.println("주행중이 아닌 상태에서는 경적을 울릴 수 없습니다.");
        }
    }

    public void stop(){
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "runningStatus=" + runningStatus +
                '}';
    }
}
