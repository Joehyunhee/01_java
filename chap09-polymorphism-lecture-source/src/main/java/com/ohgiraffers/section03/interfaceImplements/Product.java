package main.java.com.ohgiraffers.section03.interfaceImplements;

import java.io.Serializable;

public class Product extends Object implements InterProduct, Serializable {
    
    /*
    *  클래스에서 인터페이스를 상속받을 때에는 implements 키워드를 사용한다.
    *  또한 인터페이스는 여러 개를 상속받을 수 있으며,.
    *  extends 로 다른 클래스를 상속 받는 경우에도 그것과 별개로 인터페이스도 추가 상속이 가능해진다.
    *  단, extends 키워드를 앞에 작성하고 뒤에 implements 키워드를 작성한다. (순서 바뀌면 에러 발생)
    * 
    * */

    @Override
    public void abstractMethod() {
        System.out.println("interProduct의 nonstaticMethod 오버라이딩 메소드 호출");
    }

    @Override
    public void defaultMethod() {
        System.out.println("interfaceProduct default 메소드 오버라이딩 호출");
    }
}
