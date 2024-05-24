package main.java.com.ohgiraffers.section03.abstraction;

public class CarRacer {

    private Car car = new Car();

    /**
     * this.car의 시동을 거는 메소드
     * */
    public void startUp(){
        car.startUp();
    }

    /**
     * this.car 를 앞으로 가게 하는 메소드
     * */
    public void stepAccelator(){
        car.go();

    }

    /**
     * this.car. 를 멈추는 메소드
     * */
    public void stepBreak(){
        car.stop();
    }

    /**
     * this.car 의 시동을 끄는 메소드
     * */
    public void turnOff(){
        car.turnOff();
    }

}
