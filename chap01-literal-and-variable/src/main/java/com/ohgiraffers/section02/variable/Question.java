package main.java.com.ohgiraffers.section02.variable;

public class Question {
    public static void main(String[] args){

        /*
        *  김경리가 사원 10명의 월급을 입금해줘야 하는 날이다.
        *  사원의 직책은 대리/ 과장/ 차장/ 부장이 있으며
        *  대리는 100만원, 과장은 120만원, 차장은 130만원, 부장은 150만원의 월급을 받는다.
        *  보너스는 각 월급 *0.5 만큼을 더해서 주어야 한다.

        *
        * */

        // 화면에 출력되는 형태는 다음과 같아야 한다.
        // 김대리의 월급은 100만원 + 보너스 50만원으로 총 150만원 입금되었습니다.


        int cost1 = 100;
        int cost2 = 120;
        int cost3 = 130;
        int cost4 = 150;
        int bonus1 = (int) (cost1*0.5);
        int bonus2 = (int) (cost2*0.5);
        int bonus3 = (int) (cost3*0.5);
        int bonus4 = (int) (cost4*0.5);

        System.out.println("김대리의 월급은 " + cost1 + "만원 + 보너스 " + bonus1 +"만원으로 총 " +(cost1+bonus1)+ "만원 입금되었습니다." );
        System.out.println("김과장의 월급은 " + cost2 + "만원 + 보너스 " + bonus2 +"만원으로 총 " +(cost2+bonus2)+ "만원 입금되었습니다." );
        System.out.println("김부장의 월급은 " + cost3 + "만원 + 보너스 " + bonus3 +"만원으로 총 " +(cost3+bonus3)+ "만원 입금되었습니다." );
        System.out.println("김차장의 월급은 " + cost4 + "만원 + 보너스 " + bonus4  +"만원으로 총 " +(cost4+bonus4)+ "만원 입금되었습니다." );

        System.out.println("---------------------------------------------");

        System.out.println("김대리의 월급은 " + cost1 + "만원 + 보너스 " + (cost1/2) +"만원으로 총 " +(cost1+cost1/2)+ "만원 입금되었습니다." );
        System.out.println("김과장의 월급은 " + cost2 + "만원 + 보너스 " + (cost2/2) +"만원으로 총 " +(cost2+cost2/2)+ "만원 입금되었습니다." );
        System.out.println("김부장의 월급은 " + cost3 + "만원 + 보너스 " + (cost3/2) +"만원으로 총 " +(cost3+cost3/2)+ "만원 입금되었습니다." );
        System.out.println("김차장의 월급은 " + cost4 + "만원 + 보너스 " + (cost4/2) +"만원으로 총 " +(cost4+cost4/2)+ "만원 입금되었습니다." );

        System.out.println("---------------------------------------------");

        String cost1st = ("대리의 월급은 100만원 + 보너스 50만원으로 총 150만원 입금되었습니다.");
        String cost2ed = ("과장의 월급은 120만원 + 보너스 60만원으로 총 180만원 입금되었습니다.");
        String cost3th = ("부장의 월급은 130만원 + 보너스 65만원으로 총 195만원 입금되었습니다.");
        String cost4th = ("차장의 월급은 150만원 + 보너스 75만원으로 총 225만원 입금되었습니다.");


        System.out.println(cost1st);
        System.out.println(cost2ed);
        System.out.println(cost3th);
        System.out.println(cost4th);

    }
}
