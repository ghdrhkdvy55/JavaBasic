package 홍광표;

import java.util.Scanner;

/**
 * 파일명 : SungJukV2
 * 작성일 : 2020.11.17
 *
 * 프로그램 설명: 성적처리프로그램 v2
 * 이름,국어점수,영어점수,수학점수를 키보드로 입력받아
 * 총점,평균,학점을 계산하고 결과 출력
 * 단, 평균은 소수점 첫째 자리까지 출력
 * 학점기준은 '수우미양가'로 하되
 * switch문으로 학점 계산하도록 함
 *
 * 만점은 100점으로
 * 100~90, 89~80, 79~70, 69~60, 59~0
 * name, kor, eng, mat, sum, mean, grd
 *
 * 단, 성적처리 결과를 출력시 출력문을 하나만사용하기로 함
 * 그리고, Math.round()를 이용해서 평균은 소수점 둘째자리까지 끊어서 출력
 */
public class SungJukV2b {
    public static void main(String[] args) {
        //변수선언
        String name = "";
        int kor, eng, mat;
        int sum = 0;
        double mean = 0.0;
        char grd = '가';
        String fmt = "이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n총점 : %d\n평균 : %.2f\n학점 : %c";
        String result;
        //처리
        //성적데이터를
        //scanner 클래스 초기화
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력해주세요 : ");
        name = scanner.nextLine();
        System.out.print("국어 점수를 입력해주세요 : ");
        kor = scanner.nextInt();
        System.out.print("영어 점수를 입력해주세요 : ");
        eng = scanner.nextInt();
        System.out.print("수학 점수를 입력해주세요 : ");
        mat = scanner.nextInt();

        sum = kor + eng + mat;
        mean = (double)sum/3;
        mean = Math.round(mean*100)/ 100.0;
        //String.format(형식지정자, 변수들)
        //결과출력
        //학점계산은 switch문으로 처리
//        System.out.println("---------------\n이름 : " + name +
//                "\n국어 : " + kor +
//                "\n영어 : " + eng +
//                "\n수학 : " + mat +
//                "\n---------------\n총합 : " + sum +
//                "\n평균 : " + Math.round(mean*100)/100.0;
        //문자열 연결 연산자(+)로 문장을 만드는 경우
        //String 변수의 특성때문에 성능저하 발생

        result = String.format(fmt,name,kor,eng, mat, sum, mean, grd);
        System.out.println(result);

        //System.out.printf("평균 : %.1f\n" , mean);

        switch ((int)mean/10){
            case 10 :
                System.out.println("학점은 '수' 입니다"); break;
            case 9 :
                System.out.println("학점은 '수' 입니다"); break;
            case 8 :
                System.out.println("학점은 '우' 입니다"); break;
            case 7 :
                System.out.println("학점은 '미' 입니다"); break;
            case 6 :
                System.out.println("학점은 '양' 입니다"); break;
            case 5 :
                System.out.println("학점은 '가' 입니다"); break;
        }



    }
}
