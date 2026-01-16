package _4_test_260116;

public class _2_private_Ex {
    //private, 이 변수는 , 직접 접근이 안되고, 변경및 조회가 안됩니다.
    private String name;

    // 그래서, 세터를 메서드를 이용해서, 값 설정.
    public void setName(String n) {
        name = n;
    }
    // 게터 메서드를 이용해서, 값 조회.
    public String getName() {
        return name;
    }
}
