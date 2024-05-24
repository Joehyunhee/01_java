package main.java.com.ohgiraffers.section07.initblok;

public class Product {

    /*private String name;

    private int price;

    private static String brand;*/


    // 명시적 초기화

    private String name = "갤럭시";

    private int price = 1000000;

    private static String brand = "삼성";


    // 인스턴스 초기화 블럭 사용
    {
        name = "사이언";
        price = 900000;
        brand = "사과";
        System.out.println("인스턴스 초기화 블럭 동작됨");
    }


    // 정적 초기화 블럭 사용

/*    static {
        name = "아이폰";
        price = 1000000;
        brand = "애플";
    }*/

    // 기본 생성자
    public Product(){
        System.out.println("기본 생성자 호출됨");
    }

    public Product(String name, int price, String brand){
        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("전체필드 초기화 생성자 호출");
    }


    public String getInformation(){
        return "Product [ name = " + this.name + ", price = " + this.price + ", brand = " + Product.brand + "]";
    }

}
