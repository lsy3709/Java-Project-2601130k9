package _4_test_260116.ex;

public class _3_Manager_Ex3 extends _3_Employee_Ex3{
//    자식클래스
//`Manager` 클래스를 만들고, `protected` 필드를 상속받아 출력하시오.
//1) 부모 클래스 상속 받기.
//            2) 생성자를 호출, 매개변수 1개이고,
//    주의, 자식의 생성자에서 호출할 때, 반드시 부모 클래스 생성자를 먼저 호출해야함.
//            힌트) super 사용하기.

    public _3_Manager_Ex3(String department) {
        super(department);
    }

//3) 메서드 , printDept() ,
//    출력 : 소속 부서 : 개발팀
    public void printDept() {
        System.out.println("소속 부서 : " + department);
    }
}
