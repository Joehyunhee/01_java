package main.java.com.ohgiraffers.section02.encapsulation.problem1;

public class Application01 {
    public static void main(String[] args) {

        // 필드에 올바르지 않은 값이 들어가도 통제가 불가능하다.

        // 1번 몬스터 생성
        Monster monster1 = new Monster();
        // 이름과 체력 변경
        monster1.name = "두치";
        monster1.hp = 200;

        System.out.println("monster1 = " + monster1.name);
        System.out.println("monster1 = " + monster1.hp);

        // 2번 몬스터 생성
        Monster monster2 = new Monster();
        // 이름과 체력 변경
        monster2.name = "뿌꾸";
        monster2.hp = -200;

        System.out.println("monster2 = " + monster2.name);
        System.out.println("monster2 = " + monster2.hp);

        // 3번 몬스터 생성
        Monster monster3 = new Monster();
        monster3.name = "드라큘라";
        monster3.setHp(200);

        System.out.println("monster3 = " + monster3.name);
        System.out.println("monster3.hp = " + monster3.hp);
        
        // 4번 몬스터 생성
        Monster monster4 = new Monster();
        monster4.name = "프랑켄슈타인";
        monster4.setHp(-1000);

        System.out.println("monster4 = " + monster4.name);
        System.out.println("monster4.hp = " + monster4.hp);
        
        
        
    }
}
