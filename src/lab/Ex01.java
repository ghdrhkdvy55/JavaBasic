package lab;


public class Ex01 {
    public static void main(String[] args) {

        //학생 클래스를 이용해서 객체 생성
        Student std = new Student();
        //학과 클래스를 이용해서 객체 생성
        Department dept = new Department();
        //과목 클래스를 이용해서 객체 생성
        Subject subj = new Subject();
        //교수 클래스를 이용해서 객체 생성
        Professor prof = new Professor();


        // 각 객체의 변수에 값 대입
        //학생
        std.stdno = 201350050;
        std.name = "김태희";
        std.addr = "경기도 고향시";
        std.birth = "1985.3.22";
        std.dept = "컴퓨터";
        std.prof = "504";
        //학과
        dept.dname = "컴퓨터 공학";
        dept.phone = "123-4567-8901";
        dept.office = "E동 2층";
        dept.chief = "504";
        //과목
        subj.no = "0205";
        subj.subjname = "프로그래밍";
        subj.subjdesc = "자바 프로그래밍";
        subj.prof = "301";
        //교수
        prof.no = "301";
        prof.name = "이순신";
        prof.mjfield = "프로그래밍";



        //객체에 저장된 값 출력
        //학생
        System.out.println(std.stdno);
        System.out.println(std.name);
        System.out.println(std.addr);
        System.out.println(std.birth);
        System.out.println(std.dept);
        System.out.println(std.prof);
        //학과
        System.out.println(dept.dname);
        System.out.println(dept.phone);
        System.out.println(dept.office);
        System.out.println(dept.chief);
        //과목
        System.out.println(subj.no);
        System.out.println(subj.subjname);
        System.out.println(subj.subjdesc);
        System.out.println(subj.prof);
        //교수
        System.out.println(prof.no);
        System.out.println(prof.name);
        System.out.println(prof.mjfield);
    }
}
