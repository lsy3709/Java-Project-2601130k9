package _8_test_260122.ex;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _1_Gui_Ex1 {
    public static void main(String[] args) {
//        실습1
//        1)창을 띄우고, 버튼과 라벨을 동시에 추가해보세요.
//                내용은 오늘 먹을 점심 관련 아무 글.
//        힌트)
//        버튼, 라벨을 패널에 추가하기
//        panel.add(button);
//
//        JPanel panel = new JPanel(); 추가 해주고,
//        panel  을 프레임(창) 에 추가하고,
//
//        frame.add(panel);

        // 순서1, 창을 만들기.
        JFrame frame = new JFrame("오늘 점심 메뉴");

        // 순서2, 패널 만들기.
        JPanel panel = new JPanel();

        // 순서3, 버튼 만들기
        JButton button = new JButton("메뉴");

        // 순서3-2, 버튼 만들기2
        JButton exitBtn = new JButton("나가기");

        // 순서4, 라벨 만들기 .
        JLabel label = new JLabel("오늘 점심 메뉴 : 삼양라면 + 햇반");

        // 이름 입력 라벨, 텍스트 필드 입력창 만들기.
        JLabel nameLabel = new JLabel("이름 입력 : ");
        JTextField nameTextField = new JTextField(10);


        // 순서5, 조립하기.
        // frame 창에, 패널 붙이기.
        frame.add(panel);
        // 패널에 ,버튼, 라벨 붙이기.
        panel.add(label);
        panel.add(button);

        // 패널에 나가기 버튼 추가하기.
        panel.add(exitBtn);

        // 패널에, 라벨 , 텍스트필드를 붙이기.
        panel.add(nameLabel);
        panel.add(nameTextField);

        // 간단한 이벤트 처리 , 맛보기.
        exitBtn.addActionListener(new ActionListener() { // 익명클래스 구현
            @Override
            public void actionPerformed(ActionEvent e) {
                // 클릭시 동작할 기능 넣기. 창닫기.
                frame.dispose();
            }
        });

        // 순서6, 창크기, 닫기 설정, 눈에 보이기 작업.
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
