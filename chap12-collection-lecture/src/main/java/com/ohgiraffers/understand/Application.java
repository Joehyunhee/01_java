package main.java.com.ohgiraffers.understand;

import java.util.*;

public class Application {
    // 로또 티켓의 최대 구매 수
    private static final int MAX_PURCHASES = 10;

    // 로또 번호의 최대 값
    private static final int MAX_NUMBER = 45;

    // 로또 번호의 갯수
    private static final int NUMBERS_COUNT = 6;

    // 구매된 로또 저장 리스트
    private static List<Set<Integer>> lottos = new ArrayList<>();

    // 랜덤 숫자 객체
    static Random random = new Random();

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        // 총 구매된 로또 갯수
        int totalCount = 0;
        
        // 총 구매된 로또 갯수가 최대 구매 수보다 적을 때 까지 반복
        while(totalCount < MAX_PURCHASES){
            System.out.println("구매할 로또 갯수를 입력 해주세요 (최대 10개)");
            int number = scr.nextInt();
            
            //잘못된 값 입력시 대응
            if (number < 1 || number > (MAX_PURCHASES - totalCount)){
                System.out.println("잘못된 입력입니다. 1개 이상 " + (MAX_PURCHASES-totalCount)+ " 개 이하로 입력하세요");
                continue;
            }
            
            // 입력된 갯수만큼 로또 생성
            for (int i = 0; i < number; i++) {
                Set<Integer> lotto = generateLotto();
                lottos.add(lotto);
                System.out.println((lottos.size())+ " 번 로또 : " + lotto);
            }
            
            // 총 구매 된 로또 갯수 업데이트
            totalCount += number;
            
        }
        // 10개 생성 후 당첨번호 생성
        Set<Integer> winner = generateLotto();
        System.out.println("당첨 번호 : " + winner);
        
        // 당첨자 여부 확인
        boolean win = false;
        for (int i = 0; i < lottos.size(); i++) {
            if(lottos.get(i).equals(winner)){
                System.out.println((i+1) + " 번 로또 당첨 " + lottos.get(i));
                win = true;
            }
        }
        // 당첨자 없을 시 출력
        if (!win){
            System.out.println("이번 회차 당첨 없음");
        }
        
        
    }

    // 로또 티켓 출력 메소드
    public static Set<Integer> generateLotto(){
        // 중복되지 않기 위해 SET 사용
        Set<Integer> lotto = new LinkedHashSet<>();
        while(lotto.size() < NUMBERS_COUNT){
            int number = random.nextInt(MAX_NUMBER)+1;
            lotto.add(number);
        }
        return lotto;
    }
}
