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

    // 오버로딩을 이용해서, 개선하기. 기본 값을 , null , 0으로 하는게 아니라.
    // 보기 좋게, 작자 미상, 가격 미정, 제목 미정.

    public Ex2_Book(){
        // 방법1
        // 반복적인 코드 사용
//        this.name = "제목 미정";
//        this.price = "가격 미정";
//        this.writer = "작자 미상";

        // 방법2
        // this를 이용한 메서드 체이닝.
        // this -> Ex2_Book , 자기 자신을 가리킴.
        this("제목 미정","가격 미정","작자 미상");

    } // 기본 생성자

    // 책 제목만 정해진 경우

    public Ex2_Book(String name) {
//        this.name = name;
        this(name,"가격 미정","작자 미상");
    }


    // 책 제목과, 가격까지만 정해진 경우


    public Ex2_Book(String name, String price) {
//        this.name = name;
//        this.price = price;
        this(name,price,"작자 미상");
    }

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
