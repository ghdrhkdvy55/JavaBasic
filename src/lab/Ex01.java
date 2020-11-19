package lab;


public class Ex01 {
    public static void main(String[] args) {

        //학생 클래스를 이용해서 객체 생성
        //학과 클래스를 이용해서 객체 생성
        //과목 클래스를 이용해서 객체 생성
        //교수 클래스를 이용해서 객체 생성
        Student kim = new Student();
        NameClass com = new NameClass();
        NumClass prog = new NumClass();
        Teacher lee = new Teacher();


        // 각 객체의 변수에 값 대입
        kim.stuNum = 201350050;
        kim.name = "김태희";
        kim.adr = "경기도 고향시";
        kim.bir = "1985.3.22";
        kim.cName = "컴퓨터";
        kim.teacher = 504;

        com.cName = "컴퓨터 공학";
        com.callNum = "123-4567-8901";
        com.navi = "E동 2층";
        com.no1teacher = 504;

        prog.cNum = 0205;
        prog.cName = "프로그래밍";
        prog.cOutline = "자바 프로그래밍";
        prog.teacher = 301;

        lee.tNum = 301;
        lee.tName = "이순신";
        lee.major = "프로그래밍";



        //객체에 저장된 값 출력
        System.out.println(kim.stuNum);
        System.out.println(kim.name);
        System.out.println(kim.adr);
        System.out.println(kim.bir);
        System.out.println(kim.cName);
        System.out.println(kim.teacher);

        System.out.println(com.cName);
        System.out.println(com.callNum);
        System.out.println(com.navi);
        System.out.println(com.no1teacher);

        System.out.println(prog.cNum);
        System.out.println(prog.cName);
        System.out.println(prog.cOutline);
        System.out.println(prog.teacher);

        System.out.println(lee.tNum);
        System.out.println(lee.tName);
        System.out.println(lee.major);
    }
}
