package _11_test_260127.ui;

import _11_test_260127.memberProject.memberProject._3_MainClass;
import _11_test_260127.service._3_MemberService;

import javax.swing.*;
import java.awt.*;

// 260127_리팩토링_코드정리_순서10
// 화면 작업
public class _3_MemberUI extends JFrame {
    // 서비스 클래스의 도움을 받기. 서비스 도구를 가져오기.
    private _3_MemberService service;

    //UI 컴포넌트 재사용.
    private JTextArea displyArea; // 결과 출력을 위한 텍스트 영역.
    private JPanel buttonPanel; // 버튼들이 들어갈 패널
    private JLabel statusLabel; // 현재 로그인 상태 표시
    private JButton btnJoin, btnList, btnLoginLogout, btnEdit, btnSearch, btnExit, btnDelelte;

    // 생성자 만들기. 서비스 클래스의 도움을 받으면서, 생성자 호출.
    // 생성자 주입 기법, 화면에서, 만들어둔, 서비스 기능을 사용가능함.
    public _3_MemberUI(_3_MemberService service) {
        // 자식을 생성자를 초기화 하기전에, 반드시 부모 생성자를 호출해야한다.
        super("회원 관리 시스템 ver2.3 리팩토링");
        this.service = service;

        // UI 구성, 재조립, 화면 그리기 작업,
        // 미구현
//        initUI();

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        // 화면 중앙 배치
        setLocationRelativeTo(null);
    }

    // 260127_리팩토링_코드정리_순서11
    private void initUI() {
        setLayout(new BorderLayout()); // 동,서,남,북, 중앙 배치 관리자.
        statusLabel = new JLabel("로그인 상태 : 로그아웃 됨", SwingConstants.CENTER);
        statusLabel.setFont(new Font("맑은 고딕", Font.BOLD, 14));
        statusLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        add(statusLabel, BorderLayout.NORTH);

        displyArea = new JTextArea();
        displyArea.setEditable(false);// 수정 못하게 방지
        displyArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        add(new JScrollPane(displyArea), BorderLayout.CENTER);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 3, 5, 5));
        btnJoin = new JButton("1 회원가입");
        btnList = new JButton("2 목록조회");
        btnLoginLogout = new JButton("3 로그인"); //초깃값, 로그인을 하면, 로그 아웃으로 보일 예정.
        btnEdit = new JButton("4 회원수정");
        btnSearch = new JButton("5 회원검색");
        btnDelelte = new JButton("6 회원탈퇴");
        btnExit = new JButton("7 종료");

        btnList.addActionListener(new _3_MainClass.ActionHandler());
        btnJoin.addActionListener(new _3_MainClass.ActionHandler());
        btnLoginLogout.addActionListener(new _3_MainClass.ActionHandler());
        btnEdit.addActionListener(new _3_MainClass.ActionHandler());
        btnSearch.addActionListener(new _3_MainClass.ActionHandler());
        btnDelelte.addActionListener(new _3_MainClass.ActionHandler());
        btnExit.addActionListener(new _3_MainClass.ActionHandler());

        buttonPanel.add(btnJoin);
        buttonPanel.add(btnList);
        buttonPanel.add(btnLoginLogout);
        buttonPanel.add(btnEdit);
        buttonPanel.add(btnSearch);
        buttonPanel.add(btnDelelte);
        buttonPanel.add(btnExit);

        add(buttonPanel, BorderLayout.SOUTH);
//        updateButtonState();
    }

    // 260127_리팩토링_코드정리_순서12
    // printLog 정의 가져오기

    // 260127_리팩토링_코드정리_순서13
    // updateButtonState 정의 가져오기

    // 260127_리팩토링_코드정리_순서14
    // ActionHandler 정의 가져오기


}
