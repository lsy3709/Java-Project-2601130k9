package _8_test_260122.ex;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _2_Guid_Ex2 {
    public static void main(String[] args) {
//        실습2
//        "간단한 메모장" 형태의 GUI를 만들어보세요.
//                윈도우 창, JTextArea(글 입력 창), "저장" 버튼을 포함하고,
//        "저장" 버튼을 클릭하면 입력된 내용을 콘솔에 출력하도록 하세요.
//                힌트)
//        이벤트 리스너의 기능:
//        sout 콘솔에 출력하기.
//                대신에 내용을 가져오는 기능 : textArea.getText() 기능.
//
//                화면 준비물 )
//        frame, panel, button , textArea(10,30)

        // 순서1, UI 준비
        JFrame frame = new JFrame("연습 심플 메모장");
        JTextArea textArea = new JTextArea(10,30);
        JButton saveBtn = new JButton("저장");
        JPanel panel = new JPanel();

        // 순서2, UI 조립.
        // 패널에 스크롤 기능의 UI(JScrollPane) 넣기.
        panel.add(new JScrollPane(textArea));
        panel.add(saveBtn);
        frame.add(panel);
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // 순서3, 이벤트 리스너 붙이기.
        saveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(textArea.getText());
            }
        });
    }
}
