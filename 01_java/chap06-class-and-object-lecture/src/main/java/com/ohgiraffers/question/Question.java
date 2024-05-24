package main.java.com.ohgiraffers.question;

public class Question {
    public static void main(String[] args) {
        //BookDTO - 책 제목, 종류, 작가, 가격, 할인률
        // getter , setter , 생성자

        // 기본생성자를 이용한 인스턴스 생성 후 필드 값 출력
        // 필드 3가지를 초기화하는 생성자를 사용해 인스턴스 생성 후 필드 값 출력
        // 모든 필드를 초기화하는 생성자 사용해 인스턴스 생성후 필드값 출력

        BookDTO bookDTO = new BookDTO();
        System.out.println(bookDTO.toString());
        BookDTO bookDTO1 = new BookDTO("홍길동전","소설","허균");
        System.out.println(bookDTO1.toString());
        BookDTO bookDTO2 = new BookDTO("노인과바다","소설","헤밍웨이",
                15000,5);
        System.out.println(bookDTO2.toString());

    }
}
