package _4_test_260116;

public class _3_staticMain_Ex {
    public static void main(String[] args) {
        // 샘플 객체 인스턴스 3개 생성
        // number 값, count 값 비교,
        _3_static_Ex sample1 =
        new _3_static_Ex();
        sample1.number = 100;
        System.out.println("sample1.number :" + sample1.number);

        _3_static_Ex sample2 =
                new _3_static_Ex();
        sample2.number = 200;
        System.out.println("sample2.number :" + sample2.number);

        // 클래스로 증가하는 메서드를 2번 호출.
        _3_static_Ex.increment();
        _3_static_Ex.increment();

        // count로 접근 해보기.
        System.out.println("공유 count 값 조회 : " +_3_static_Ex.count );



    }
}
