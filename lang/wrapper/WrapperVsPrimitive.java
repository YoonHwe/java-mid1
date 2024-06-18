package lang.wrapper;

public class WrapperVsPrimitive {

    public static void main(String[] args) {
        int iterations = 1_000_000_000; //자바에서 숫자에 언더바 넣도록 허용.
        long startTime, endTime;

        //기본형 LONG 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();

        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 LONG 실행 시간 : " + (endTime - startTime) +"ms");

        //래퍼 클래스 LONG 사용

        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i;
        }
        endTime = System.currentTimeMillis();

        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("기본 자료형 LONG 실행 시간 : " + (endTime - startTime) +"ms");
    }
}
