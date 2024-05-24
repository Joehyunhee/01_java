package main.java.com.ohgiraffers.section01.understand;

import main.java.com.ohgiraffers.section01.understand.car.Car;
import main.java.com.ohgiraffers.section01.understand.car.ElectricCar;
import main.java.com.ohgiraffers.section01.understand.car.OldCar;
import main.java.com.ohgiraffers.section01.understand.seller.Seller;

public class Application {
    public static void main(String[] args) {

        System.out.println("자동차 판매 프로그램 입니다.");
        System.out.println("전기차");
        ElectricCar ionic1 = new ElectricCar("H",1000,"ionic1","1000km");
        ElectricCar ionic2 = new ElectricCar("H",1500,"ionic2","1500km");
        ElectricCar ionic3 = new ElectricCar("H",2000,"ionic3","2000km");

        System.out.println("내연기관 자동차");
        OldCar porter = new OldCar("H",1500,"porter","diesel");
        OldCar avante = new OldCar("H",1500,"avante","gasoline");
        OldCar sonata = new OldCar("H",2000,"sonata","gasoline");

        System.out.println("영업 사원 입사 ");
        Seller seller = new Seller("홍길동");

        Car[] cars = {porter,ionic1,avante,sonata,ionic3};

        seller.sale(cars);
        System.out.println("결산 : " + seller);



    }
}
