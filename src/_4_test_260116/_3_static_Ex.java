package _4_test_260116;

public class _3_static_Ex {
    // 각 인스턴스의 값에 따라 결정
    public int number = 0;
    // 공유자원이라서, 모든 인스턴스가 값이 동일.
    public static int count = 0;

    public static void increment() {
        count++;
    }
}
