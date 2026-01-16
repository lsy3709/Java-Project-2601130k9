package _4_test_260116.homework;

public class _0_Test_homework_StarCoffeeMain_Ex1 {
    public static void main(String[] args) {
//        2) 실행 클래스 : StarCoffeeMain
//                - 샘플 주문, 3개 주문을 하고,
//                - 각각 매개변수 1개 생성자 호출
        _0_Test_homework_StarCoffeeMenu_Ex1 coffee1 =
                new _0_Test_homework_StarCoffeeMenu_Ex1("디카페인 커피");
        coffee1.showMenu();
//                - 매개변수 2개인 생성자 호출
        _0_Test_homework_StarCoffeeMenu_Ex1 coffee2 =
                new _0_Test_homework_StarCoffeeMenu_Ex1("자몽차","그란데");
        coffee2.showMenu();
//                - 매개변수 3개인 생성자 호출
        _0_Test_homework_StarCoffeeMenu_Ex1 coffee3 =
                new _0_Test_homework_StarCoffeeMenu_Ex1("아이스티","그란데",false);
        coffee3.showMenu();
//        각각의 주문 내역서 호출하기.
    }
}
