package _11_test_260127.memberProject.memberProject.upgradeMemberProgram.dto;

public class MemberDTO {
    private String name;
    private String email;
    private String password;
    private int age;
    // 기본 생성자
    public MemberDTO() {
    }
    // 매개변수 생성자
    public MemberDTO(String name, String email, String password, int age) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
    }
    // 게터 & 세터 , 필요.
    // 위의 준비물 3가지는 코드를 직정 타이핑 안하고, 소스 -> 자동 생성.
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
