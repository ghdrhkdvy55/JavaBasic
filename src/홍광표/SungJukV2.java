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
 */
public class SungJukV2 {
    public static void main(String[] args) {
        //변수선언
        String name = "";
        int kor, eng, mat;
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력해주세요 : ");
        name = scanner.nextLine();
        System.out.println("국어 점수를 입력해주세요 : ");
        kor = scanner.nextInt();
        System.out.println("영어 점수를 입력해주세요 : ");
        eng = scanner.nextInt();
        System.out.println("수학 점수를 입력해주세요 : ");
        mat = scanner.nextInt();

        int sum = 0;
        double mean = 0.0;
        char grd = '가';
        //처리
        sum = kor + eng + mat;
        //mean = (kor + eng+ mat) /3
        mean = (double)sum/3;




        //결과출력








        System.out.println("---------------");

        grd = (mean>=90) ? '수' :
              (mean>=80) ? '우' :
              (mean>=70) ? '미' :
              (mean>=60) ? '양' : '가';
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.1f", mean);
        switch (grd){
            case '수' :
                System.out.println("학점은 '수' 입니다");
                break;
            case '우' :
                System.out.println("학점은 '우' 입니다");
                break;
            case '미' :
                System.out.println("학점은 '우' 입니다");
                break;
            case '양' :
                System.out.println("학점은 '우' 입니다");
                break;
            case '가' :
                System.out.println("학점은 '우' 입니다");

        }



    }
}
