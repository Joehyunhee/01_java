package main.java.com.ohgiraffers.section04.wrapper;

public class Application02 {
    public static void main(String[] args) {
//       parsing : 문자열(String)으로 받은 값을 기본 자료형을 변경하는 것.
        byte b = Byte.parseByte("1");
        short s = Short.parseShort("2");
        int i = Integer.parseInt("4");
        long l = Long.parseLong("8");
        float f = Float.parseFloat("4.0");
        double d = Double.parseDouble("8.0");
        boolean bl = Boolean.parseBoolean("true");

        // char는 parsing을 제공하지 않는다.
        char c ="abc".charAt(0);
    }
}
