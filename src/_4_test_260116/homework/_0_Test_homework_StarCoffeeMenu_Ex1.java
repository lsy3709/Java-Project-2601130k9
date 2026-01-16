package _4_test_260116.homework;

public class _0_Test_homework_StarCoffeeMenu_Ex1 {
//    실습3
//    스타벅스 메뉴 개발하는 클래스 작성.
//1) 설계 클래스 : StarCoffeeMenu
//            멤버, 변수
//    메뉴이름 :  menuName (String)
//    사이즈 : size (String)
//    핫?아? : isHot (boolean)
    String menuName;
    String size;
    boolean isHot;

//
//- 생성자 메뉴만 정하면, 사이즈 기본 : "Tall" , 핫 : 기본 true -> 매개변수 1개인 생성자
    public _0_Test_homework_StarCoffeeMenu_Ex1(String menuName) {
        // 개선전
//        this.menuName = menuName;
        // 개선 후, 메소드 체이닝 , 매개변수가 3개인 생성자를 재사용 -> this
        this(menuName,"Tall", true);
    }
//- 생성자, 메뉴와 사이즈 따로 정하면, 기본 : 핫 -> 매개변수 2개인 생성자
    public _0_Test_homework_StarCoffeeMenu_Ex1(String menuName, String size) {
        // 개선전
//        this.menuName = menuName;
//        this.size = size;
        // 개선 후, 메소드 체이닝 , 매개변수가 3개인 생성자를 재사용 -> this
        this(menuName,size, true);
    }
//- 생성자, 메뉴, 사이즈, 핫 여부 따로 주문 -> 매개변수 3개인 생성자

    public _0_Test_homework_StarCoffeeMenu_Ex1(String menuName, String size, boolean isHot) {
        this.menuName = menuName;
        this.size = size;
        this.isHot = isHot;
    }

//
//- 메서드는 , 주문한 내역을 보여주는 메서드 : showMenu
//    예시) 주문한 메뉴 : 디카페인커피
//    사이즈 : 그란데
//    핫 : true
//    주문 내역서 출력.
    public void showMenu() {
        System.out.println("주문한 메뉴 : " + menuName);
        System.out.println("사이즈 : " + size);
        System.out.println("핫 : " + isHot);
        System.out.println("주문 내역서 ");
        System.out.println("==============================");

    }
}
