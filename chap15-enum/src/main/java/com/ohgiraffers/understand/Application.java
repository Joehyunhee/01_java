package main.java.com.ohgiraffers.understand;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Library library = new Library();
        Scanner scr = new Scanner(System.in);

        while (true) {
            System.out.println("=========================");
            System.out.println("도서 관리 시스템");
            System.out.println("1. 도서 추가 ");
            System.out.println("2. 장르별 도서 목록 보기 ");
            System.out.println("3. 도서 대여  ");
            System.out.println("4. 도서 반납 ");
            System.out.println("5. 종료 ");
            System.out.println("6. 옵션을 선택 해주세요 ");

            // 여기까지 작성했을 때 무한 반복됨 return 값을 설정 안해서
            int choice = 0;

            try {
                choice = scr.nextInt();
                scr.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("도서 제목을 입력 해주세요");
                        String title = scr.nextLine();
                        System.out.println(" 도서 저자를 입력 해주세요");
                        String author = scr.nextLine();
                        System.out.println(" 도서 등록번호를 입력 해주세요");
                        int number = scr.nextInt();
                        scr.nextLine();
                        String num = number + "";
                        Genre genre = null;
                        do {
                            try {
                                System.out.println("장르를 입력 해주세요(FICTION, NONFICTION, SCIENCE, FANTASY, MYSTERY)");
                                String genStr = scr.nextLine();
                                genre =
                            }
                        }
                }

            }


        }


    }
}
