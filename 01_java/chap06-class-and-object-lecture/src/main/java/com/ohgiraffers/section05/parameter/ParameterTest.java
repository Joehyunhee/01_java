package main.java.com.ohgiraffers.section05.parameter;

public class ParameterTest {

    public void testPrimaryTypeParameter(int num){
        System.out.println("매개변수로 전달 받은 값 :" + num);
    }

    public void testPrimaryTypeArrayParameter(int[] iarr){
        /*
        *  배열의 주소가 전달된다.
        *  즉 인자로 보내는 배열과 매개변수로 전달받은 배열은 서로 동일한 배열을 가리킨다. (얕은복사)
        * */
        System.out.println("iarr : " + iarr);

        System.out.println("배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        iarr[0] = 99;
        System.out.println("변경 후 배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }


    public void testClassTypeParameter(RectAngle rectAngle){

        System.out.println("매개변수로 전달받은 값 : " + rectAngle);

        System.out.println("변경 전 사각형의 넓이와 둘레 : ");
        rectAngle.calcArea();
        rectAngle.calcRound();

        System.out.println("변경 후 사각형의 넓이와 둘레 : ");
        rectAngle.setWidth(100);
        rectAngle.setHeight(100);
        rectAngle.calcArea();
        rectAngle.calcRound();
    }

    public void testVariableLengthArrayParameter(String name, String... hobby){

        System.out.println("이름 : " + name);
        System.out.println("취미의 갯수 : " + hobby.length);
        System.out.println("취미 : " );

        for (String hobbys:hobby) {
            System.out.print(hobbys + " ");
        }
        System.out.println();
    }

}
