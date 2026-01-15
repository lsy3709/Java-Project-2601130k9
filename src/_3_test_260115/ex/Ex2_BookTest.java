package _3_test_260115.ex;

public class Ex2_BookTest {
    public static void main(String[] args) {
        // 실행 할 클래스 , main 메서드가 필요합니다.
        // 2)클래스 사용(샘플 책3권 만들기)
        //3) 메인 메서드가 있는 클래스에서,
        //책 3권의 소개 기능을 구현 하기.
        // [클래스명] [참조형 변수이름(객체명,인스턴스라고 부름)] = new  [클래스명=생성자명]();

        // 기본 생성자 이용할 경우
//        Ex2_Book book1 = new Ex2_Book();
//        Ex2_Book book2 = new Ex2_Book();
//        Ex2_Book book3 = new Ex2_Book();

        // 매개변수가 3개인 생성자 이용하기.
        Ex2_Book book1 = new Ex2_Book("샘플 책1","10000원","이상용1");

        // 기본 생성자 이용할 경우
        // 책 3권에 대해서, 제목, 가격, 저자를 각각 등록.
//        book1.name = "샘플 책1";
//        book1.price = "10000원";
//        book1.writer = "이상용1";

        // 책 소개하는 기능 사용하기. 함수 사용.
        book1.introduceBook();


        //// 기본 생성자 이용할 경우
        // 책 3권에 대해서, 제목, 가격, 저자를 각각 등록.
//        book2.name = "샘플 책2";
//        book2.price = "10000원";
//        book2.writer = "이상용2";

        // 매개변수가 3개인 생성자 이용하기.
        Ex2_Book book2 = new Ex2_Book("샘플 책2","10000원","이상용2");

        // 책 소개하는 기능 사용하기. 함수 사용.
        book2.introduceBook();
        //
        // 기본 생성자 이용할 경우
        // 책 3권에 대해서, 제목, 가격, 저자를 각각 등록.
//        book3.name = "샘플 책3";
//        book3.price = "10000원";
//        book3.writer = "이상용3";

        // 매개변수가 3개인 생성자 이용하기.
        Ex2_Book book3 = new Ex2_Book("샘플 책3","10000원","이상용3");

        // 책 소개하는 기능 사용하기. 함수 사용.
        book3.introduceBook();
    }
}
