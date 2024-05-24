package main.java.com.ohgiraffers.section02.string;

public class Application04 {
    public static void main(String[] args) {
        /*
         * 이스케이프(escape) 문자
         * 문자열 내에서 사용하는 문자 중 특수 문자를 표현하거나 특수기능을 사용할 때 사용하는 문자이다.
         * 이스케이프 문자
         * \n 개행(줄바꿈)
         * \t 탭
         * \' 작은 따옴표
         * \" 큰 따옴표
         * \\ 역슬래시 표시
         * */

        System.out.println("안녕하세요. \n 저는 홍길동입니다.");
        System.out.println("안녕하세요. \t 저는 홍길동입니다.");
        System.out.println("안녕하세요. 저는 '홍길동' 입니다.");
//        System.out.println(''');
        System.out.println('\'');
//        System.out.println("안녕하세요. 저는 "홍길동"입니다.");
        System.out.println("안녕하세요.  저는 \"홍길동\"입니다.");
//        System.out.println("안녕하세요. 저는 \홍길동\입니다.");
        System.out.println("안녕하세요. 저는 \\홍길동\\입니다.");

        /*
         * split() 시 이스케이프 문자를 사용해야 하는 특수문자도 존재한다.
         *
         * 사용 안하는 특수문자
         * ~ ` ! @ # % & - _ = ; : ' \ " , < > /
         * 이스케이프 문자를 사용해야하는 특수문자(\\)
         * $ ^ * ( ) + | { } [ ] . ?
         *
         * 앞에 \\를 붙여야한다.
         * 정규표현식에서 사용되는 특수문자인 경우 \$가 정규표현식 문자와 겹치게 된다.
         * 따라서 $ 를 기준으로 split 을 하기 위해서는 정규표현식 문자가 아닌 $  라는 구분자로 split 하겠다는 의미로
         * 사요되려면 구분문자를 \$로 표현해야한다.
         * 하지만, 역슬래시가 위에서 배운 이스케이프문자의 역슬래시와 겹친다.
         * 따라서 \\$ 를 해야 역슬래시 +$ 로 인식해서 정규표현식을 탈출하는 문자가된다.
         *
         * */
        String str = "java/oracle/jdbc";
        String[] sarr = str.split("/");

        for (String s : sarr) {
            System.out.println(s);
        }

        /*split은 프론트에서 로그인한 정보가 db로 넘어오면 길게 방대한 양이 들어옴 그걸 어떻게 잘 짜르냐에서 split */

    }
}
