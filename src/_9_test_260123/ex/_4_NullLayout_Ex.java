package _9_test_260123.ex;

import javax.swing.*;

public class _4_NullLayout_Ex {
//    실습4
//    setLayout(null)로
//"이름", "나이" 라벨과 입력란, "확인" 버튼을
//            각각
//    좌표 (x,y) : (15,15), (15,50), (70,15), (70,50), (110,90)에
//    크기 (50,25), (100,25) (고정)
//    크기 (50,30), (100,30) (고정)
//
//    가로 50, 100, 세로 25/30 크기로 배치하세요.
    public static void main(String[] args) {
        JFrame frame = new JFrame("실습4");
        frame.setLayout(null);

        JLabel nameLabel = new JLabel("이름");
        nameLabel.setBounds(15,15,50,25);
        JTextField nameField = new JTextField();
        nameField.setBounds(70,15,100,25);

        JLabel ageLabel = new JLabel("나이");
        ageLabel.setBounds(15,50,50,25);
        JTextField ageField = new JTextField();
        ageField.setBounds(70,50,100,25);

        JButton btn = new JButton("확인");
        btn.setBounds(110, 90, 80,30);

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(btn);

        frame.setSize(220,180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



    }
}
