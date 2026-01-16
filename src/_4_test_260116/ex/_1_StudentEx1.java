package _4_test_260116.ex;

public class _1_StudentEx1 {
//    실습1
//
//1) 성적이 90점 이상인 학생만 출력하시오.
//    클래스명 StudentEx1 :
//    멤버 변수 : name(String), score(int)
     String name;
     int score;
//    생성자 : 매개변수가 2개인 생성자 생성
    public _1_StudentEx1(String name, int score) {
        this.name = name;
        this.score = score;
    }

//    2)
//    객체 배열을 반환하는 메소드 만들기
//    메소드명 : createStudents
//    반환타입: _1_StudentEx1
//    이용해보기.
    _1_StudentEx1[] createStudents() {
        return new _1_StudentEx1[] {
                new _1_StudentEx1("더미 학생1",95),
                new _1_StudentEx1("더미 학생2",90),
                new _1_StudentEx1("더미 학생3",85),
        };
    }


}
