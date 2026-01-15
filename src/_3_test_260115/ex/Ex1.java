package _3_test_260115.ex;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
//        실습1
//        숫자 입력 예외 처리,
//        사용자가 문자를 입력했을 때 예외 처리
//        (스캐너 도구를 이용하고, 숫자를 가져와서 사용하는 구조이고,
//                거기에 사용자가, 문자를 입력했을 때 처리하는 경우)
//
//        힌트) try-catch` 구문을 이용하기.
//        예외처리 방식 1) 큰범위로 합니다.
//catch (Exception e) {

        // 순서1, 스캐너 도구를 사용.
        // 1. 스캐너 도구 이용
        Scanner scanner = new Scanner(System.in);

        // 순서2, 실험장에서 작업하기.
        try {
            // 순서3, 입력란을 만들기.
            System.out.println("숫자를 입력하세요 : (문자열을 입력해서 예외처리 연습중)");

            // 순서4, 사용자가 입력한 내용을 가져오기, 숫자를 가져오기
            int number = scanner.nextInt();
            // 순서5, 출력하기.
            System.out.println("입력한 숫자 : " + number);

        } catch (Exception e) {
            // 순서6, 예외가 발생할 경우, 처리하기.
            System.out.println("올바른 숫자를 입력 해주세요.");
            // 오류가 발생한 이력을 조사를 할수 있다.
            e.printStackTrace();
        } finally {
            scanner.close();
            System.out.println("try 구문에서, 성공 또는 실패를 해도 무조건 실행되는 구간.");
        }


    }
}
