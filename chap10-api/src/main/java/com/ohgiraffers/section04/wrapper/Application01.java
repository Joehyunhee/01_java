package main.java.com.ohgiraffers.section04.wrapper;

public class Application01 {
    public static void main(String[] args) {
        // 일반 기본 자료형들을 객체 자료형을 만들어주기위해 감싸줌
        /*
         * 상황에 따라 기본 타입의 데이터를 인스턴스화 해야하는 경우들이 발생한다.
         * 이 때 기본 타입의 데이터를 먼저 인스턴스로 변환 후 사용해야 하는데
         * 8가지에 해당하는 기본 타입의 데이터를 인스턴스화 할수 있도록 하는 클래스를
         * 래퍼클래서 (Wrapper class) 라고 한다.
         *
         * 기본 타입         래퍼클래스
         * byte              Byte
         * short             Short
         * int               Integer
         * long              Long
         * float             Float
         * double            Double
         * char              Character
         * boolean           Boolean
         * */

        /*
         * 박싱(Boxing)과 언박싱(unboxing)
         * 기본 타입을 래퍼클래스의 인스턴스로 인스턴스화 하는 것을 박싱이라고 하며,
         * 래퍼클래스 타입의 인스턴스를 기본 타입으로 변경하는 것을 언박싱 이라고한다.
         *
         * */

        int intValue = 20;
        Integer boxingNumber1 = new Integer(intValue); // 왜 빨간줄? deprecated : 향후 버전 업데이트이후 사라질수 있어서 사용지양해
        Integer boxingNumber2 = Integer.valueOf(intValue); // 제일 권장함

        int unBoxingNumber = boxingNumber1.intValue();

        /*
         * autoboxing 오토박싱, 오토 언박싱
         * jdk 1.5 부터는 박싱과 언박싱이 필요한 솽황에서 자바 컴파일러가 이를 자동을 처리해준다.
         * 이런 자동화된 박싱과 언박싱을 오토박싱 , 오토 언박싱이라고 부른다.
         *
         * */

        Integer boxingNumber3 = intValue; // 오토박싱
        int unBoxingNumber2 = boxingNumber3; //오토 언박싱

        //Wrapper 클래스 값 비교
        int inum = 20;
        Integer integerNum1 = new Integer(20);
        Integer integerNum2 = new Integer(20);
        Integer integerNum3 = 20;
        Integer integerNum4 = 20;

        // 기본 타입과 래퍼클래스 타입 == 연산
        System.out.println("int 와 integer 비교 : " + (inum == integerNum1));
        System.out.println("int 와 integer 비교 : " + (inum == integerNum3));
        // 갑을 가지고 비교해서 값이 같아 true 로 나온것?

        //생성자를 이용해 인스턴스 == 비교
        System.out.println("integer와 integer 비교 : " + (integerNum1 == integerNum2));
        System.out.println("integer와 integer 비교 : " + (integerNum1 == integerNum3));
        System.out.println("integer 와 integer비교 : " + (integerNum3 == integerNum4));
        // 오토박싱은 == 비교 가능

        // equals로 비교하는 게 값이 제일 정확하다
        System.out.println("equals() : " + (integerNum1.equals(integerNum2)));
        System.out.println("equals() : " + (integerNum1.equals(integerNum3)));

        /*
         * Integer.valueOf() 를 이용하여 인스턴스를 생성하는 것을 더 권장한다.
         * valueOf()는 동일한 값이 동일한 인스턴스 임을 보장한다.
         * */
        System.out.println("valueOf() : " + (Integer.valueOf(123) == Integer.valueOf(123)));


    }
}
