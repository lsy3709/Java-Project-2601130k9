package _4_test_260116;

public class _2_privateMain_Ex {
    public static void main(String[] args) {
        _2_private_Ex sample1 =
                new _2_private_Ex();
        // 이전에, public 일 때, 접근 가능 했지만
        // 현재는 private 라서 접근 제한된다.
//        sample1.name = "상용";
        // 이제부터 , 값을 설정 , setName
        sample1.setName("상용");
        // 값을 조회할 때, 전용 메서드를 이용. getName
        String name = sample1.getName();
        System.out.println("조회한 이름 : " + name);
    }
}
