package _3_test_260115.ex;

public class Ex2_Book {
    // 설계 도면으로 사용할 클래스

    // 실습2
    //1.
    //1) 클래스 설계(정의)
    //클래스명 : Book -> Ex2_Book
    //멤버 변수 1) name 2) price 3) writer
    String name;
    String price;
    String writer;
    public Ex2_Book(){} // 기본 생성자
    // 개선하기.
    // 매개변수가 3개인 생성자를 이용해서, 데이터를 처음부터 담아서, 생성하기.
    // 우클릭 -> 생성 -> 생성자 선택 -> 멤버를 다 선택. ctrl 누른 상태 선택, 클릭 하기. 생성.
    public Ex2_Book(String name, String price, String writer) {
        this.name = name;
        this.price = price;
        this.writer = writer;
    }

    //기능 :책소개 메서드 이름 : introduceBook()
    void introduceBook(){
        System.out.println("책의 이름 : " + this.name);
        System.out.println("책의 가격 : " + this.price);
        System.out.println("책의 저자 : " + this.writer);
        System.out.println();
    }
    //기능 내부에는 , 현재 책의 이름과, 가격과 저자를 소개하는 출력 기능이 있습니다.


}
