package 홍광표;

import java.util.Scanner;



/**
 * 파일명 : SungJukV3
 * 작성일 : 2020.11.17
 *
 * 프로그램 설명: 성적처리프로그램 v3
 * 학생 3명의 성정데이터를 입력받아서
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
 *
 */
public class SungJukV3 {
    public static void main(String[] args) {
        //변수선언  +선언할때 초기화도 해두면 좋다. +줄복사 ctrl+d
        //배열 변수선언
        //자료형 면수면[] = new 자료형[크기];
        String name[] = new String[3];
        int kor[] = new int[3];
        int eng[] = new int[3];
        int mat[] = new int[3];
        int sum[] = new int[3];
        double mean[] = new double[3];
        char grd[] = new char[3];
        String fmt =        //평균의 %f로 하면 플롯의 소수점 7자리까지나온다. string으로 바꾸고 내려가서
                "이름 : %s\n국어: %d\n영어: %d\n수학: %d\n총합: %d\n평균:%.1f\n학점:%c\n";
        String result;

        Scanner sc = new Scanner(System.in);
        //처리

        for(int i = 0; i < 3; ++i) {
            System.out.println((i+1) + "번째 학생 성적 입력");
            System.out.print("이름을 입력하세요 :");          //이름을 입력하세요 : 줄바꿈이 안일어나고 입력받을 수 있게 print문으로 한다.
            name[i] = sc.nextLine();  //문자를 받을때는 nextLine();
            System.out.print("국어점수를 입력하세요 :");
            kor[i] = sc.nextInt();    //정수를 받을때는 nextInt(); 실수는 Double
            System.out.print("영어점수를 입력하세요 :");
            eng[i] = sc.nextInt();
            System.out.print("수학점수를 입력하세요 :");
            mat[i] = sc.nextInt();

            // 수학성적입력시 같이 입력된 enter키가 다음 데이터(이름) 입력시 입력값으로 자동으로 전달됨
            //그러한 상황을 해결하기 위해 미리 엔터키를 제거하는 코드 삽입
            sc.skip("\r\n|[\n\r]");

        }



        for(int i =0; i < 3; ++i){
            sum[i] = kor[i] + mat[i] + eng[i];   //총합
            mean[i] = (double) sum[i] / 3; //평균

            //학점계산은 switch문으로 처리

            switch ((int) (mean[i] / 10)) {
                case 10:
                case 9:
                    grd[i] = '수';
                    break;
                case 8:
                    grd[i] = '우';
                    break;
                case 7:
                    grd[i] = '미';
                    break;
                case 6:
                    grd[i] = '양';
                    break;
                default:
                    grd[i] = '가';
            }
        }

        for(int i =0; i <3; ++i) {
            System.out.printf(fmt, name[i], kor[i], eng[i], mat[i], sum[i], mean[i], grd[i]);

            //mean의 값만 String.valueOf로 해준다.
        }

        //결과출력





    }
}