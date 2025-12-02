package First.src;

public class Student {
    //멤버 변수: 클래스가 가진 속성
    //학생의 학번, 이름, 학년, 사는 곳

    int studentId;  //낙타체(소문자로 시작해서 단어가 바뀔때 대문자)
    String name;
    int grade;
    String address;

    //메서드: 클래스가 가진 행동
    void introduce(){
        System.out.println("저는 " + grade + "학년 " + name + "입니다.");

    }
    void act(){
        System.out.println("서지원 ㅂaㅅ");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "김하늘";
        s1.grade = 2;
        s1.introduce(); //실행

        Student s2 = new Student();
        s2.name = "서지원";
        s2.grade = 1;
        s2.introduce();
        s2.act();
    }
}
