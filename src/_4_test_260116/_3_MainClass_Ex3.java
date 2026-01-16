package _4_test_260116;

import _4_test_260116.ex._3_Manager_Ex3;

public class _3_MainClass_Ex3 {
    public static void main(String[] args) {
//        메인 클래스
//        샘플 Manager 2개 정도 만들고,
        _3_Manager_Ex3 manager1 = new _3_Manager_Ex3("개발부");
        _3_Manager_Ex3 manager2 = new _3_Manager_Ex3("영업부");
//                부서를 출력 해보기.
        manager1.printDept();
        manager2.printDept();
    }
}
