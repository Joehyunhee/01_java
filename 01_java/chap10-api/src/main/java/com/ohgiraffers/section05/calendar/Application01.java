package main.java.com.ohgiraffers.section05.calendar;

import java.util.Date;

public class Application01 {
    public static void main(String[] args) {
        /*
         * Date 클래스 (지금은 타임이라 함)
         * jdk 1.0부터 날짜를 취급하기 위해 사용되던 date 클래스는
         * 생성자를 비롯하여 대부분의 메소드가 deprecated 되어 있다.
         *
         * Deprecated?
         * 향후 버전이 업데이트되면서 사라지게 될 기능이니 가급적이면 사용을 권장하지 않는다는 의미이다.
         * 하지만 하위 버전의 호환성 떄문에 한번에 제거되는 것은 아니고 남겨두었기 떄문에 사용하는 것이 가능하다.
         *
         * jdk1.1부터는 새롭게 제공되는  calendar 클래스를 이용하여 날짜와 시간에 관한 처리를 하게 된다.
         * 하지만 calendar 클래스는 몇가지 문제를 가지고 있다.
         * */

        /*
         * 1. Calendar 인스턴스는 불변객체가 아니기 떄문에 값을 수정할 수 있다.
         *
         * 2. 윤초(leep second)는 고려하지 않는다. 윤달
         * 윤초란 ? 협정 세계시에서 사용하는 세슘 원자시계와 실제 지구의 자전/공전 속도를 기준으로 한 태양시의 차이로 인해 발생한
         * 오차를 보정하기 위해 추가하는 1초이다.
         *
         * 12월 31일 마지막에 추가하거나 혹은 6월 30일의 마지막에 추가된다.
         * 윤초는 사소해 보이지만 실제 2012년 링크드인 과 같은 대규모 서비스의 마비시킨 버그를 발생시킨적도 잇다
         *
         * 3. Calendar 클래스는 월을 0부터 1까지 표현하는 불편함이 있다.
         *
         * jdk8 부터는 이러한 문제를 해결할 수 잇는 time 패키지를 제공하고 있다.
         *
         * */

        Date today = new Date();
        System.out.println(today);

        System.out.println(today.getTime()); // 1716270824336 이렇게 출력됨 : 1970.01.01 부터 시작된 밀리세컨드로 표시

        Date time = new Date(1716270824336L); // 1716270824336에 대문자 L 붙이면

        System.out.println(time); // Tue May 21 14:53:44 KST 2024 출력됨



    }
}
