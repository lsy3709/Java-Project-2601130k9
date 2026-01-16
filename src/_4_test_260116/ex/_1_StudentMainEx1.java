package _4_test_260116.ex;

public class _1_StudentMainEx1 {
    public static void main(String[] args) {
//
//    StudentEx1 를 요소로 가지는 배열을 생성해서,
        _1_StudentEx1[] arr = {
                new _1_StudentEx1("상용1", 100),
                new _1_StudentEx1("상용2", 90),
                new _1_StudentEx1("상용3", 80)
        };
//    샘플 학생 3명 생성, 배열에 담아서, 반복문 이용해서 출력하기.
        //    학생 이름과, 점수를 출력하기.
        System.out.println("==============================");
        System.out.println("실습1, 90점 이상 학생 출력하기. ");
        for(_1_StudentEx1 student :arr) {
            if(student.score >= 90) {
                System.out.println("이름 : " + student.name + ", 점수 : " +student.score);
            }
        }

        System.out.println("==============================");
        System.out.println("실습2, 학생 요소를 가지는 배열을 반환하는 기능 이용. ");
        // 현재, 배열을 생성하는 기능은 _1_StudentEx1 클래스에 있음.
        _1_StudentEx1 studentEx1 = new _1_StudentEx1("상용1", 100);
        _1_StudentEx1[] arr2  = studentEx1.createStudents();
        for(_1_StudentEx1 student :arr2) {
            if(student.score >= 90) {
                System.out.println("이름 : " + student.name + ", 점수 : " +student.score);
            }
        }

    }
}
