package _2_test_260114;

public class _4_Test_Array_Ex {

    //        예제 3: 배열 리턴 메서드 사용
    public static int[] getData() {
        return new int[]{5, 10, 15};
    }

    public static void main(String[] args) {
        // 예제 1: 배열 선언 후 출력
        int[] nums = {10, 20, 30};
        for (int n : nums) { // 향상된 for , 배열의 모든 요소를 순회.
            System.out.println(n);
        }

// 예제 2: 2차원 배열 순회
        int[][] grid = {{1,2}, {3,4}};
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        //        예제 3: 배열 리턴 메서드 사용
        // static, main 메소드 밖으로 이동 했음.
        int[] result = getData();
        System.out.println(result[1]); // 10
    }
}
