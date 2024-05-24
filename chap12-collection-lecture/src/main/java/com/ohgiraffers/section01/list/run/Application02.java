package main.java.com.ohgiraffers.section01.list.run;

import main.java.com.ohgiraffers.section01.list.comparator.AscendingPrice;
import main.java.com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.*;

public class Application02 {
    public static void main(String[] args) {

        List<BookDTO> bookList = new ArrayList<>();

        bookList.add(new BookDTO(1,"홍길동전","허균",50000));
        bookList.add(new BookDTO(2,"목민심서","정약용",30000));
        bookList.add(new BookDTO(3,"동의보감","허준",40000));
        bookList.add(new BookDTO(4,"삼국사기","김부식",45000));
        bookList.add(new BookDTO(5,"삼국유사","일연",58000));

//        System.out.println("컬렉션 sort 정렬 =========");
//        Collections.sort(bookList);
//        System.out.println(bookList);

        for (BookDTO bookDTO:bookList) {
            System.out.println(bookDTO);
        }
        System.out.println();
        System.out.println("가격 오름차순 정렬 =========");
        bookList.sort(new AscendingPrice());
        for (BookDTO bookDTO:bookList) {
            System.out.println(bookDTO);

        }

        System.out.println("책 제목을 기준으로 오름차순 정렬 =======");
        bookList.sort(new Comparator<BookDTO>() {
            @Override

            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        for (BookDTO bookDTO:bookList) {
            System.out.println(bookDTO);
        }

        System.out.println("작가 기준으로 오름차순 정렬 =======");
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getAuthor().compareTo(o2.getAuthor()) *-1 ;
            }
        });
        for (BookDTO bookDTO:bookList) {
            System.out.println(bookDTO);
        }


        System.out.println("======= 람다 표현식 ======");
        bookList.sort((BookDTO b1, BookDTO b2) -> b1.getTitle().compareTo(b2.getTitle()));
        for (BookDTO bookDTO:bookList) {
            System.out.println(bookDTO);
        }


    }
}
