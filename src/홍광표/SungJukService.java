package 홍광표;

import java.util.Scanner;

/**
 * 파일명 : SungJukV5
 * 작성일 : 2020.11.20
 *
 * 프로그램 설명: 성적처리프로그램 v5
 * 이름,국어점수,영어점수,수학점수를 키보드로 입력받아
 * 총점,평균,학점을 계산하고 결과 출력
 * 단, 평균은 소수점 첫째 자리까지 출력
 * 학점기준은 '수우미양가'로 하되
 * switch문으로 학점 계산하도록 함
 *
 * 만점은 100점으로
 * 100~90, 89~80, 79~70, 69~60, 59~0
 * name, kor, eng, mat, sum, mean, grd

 */

public class SungJukService {

    /**
     * 성적 데이터 입력 메서드
     *  @return 키보드로 입력받는 성적데이터 SungJukVO
     *
     */
    public SungJukVO readSungJuk() {
        String name;
        int kor, eng, mat;

        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력해주세요 : ");
        name = scanner.nextLine();
        System.out.print("국어 점수를 입력해주세요 : ");
        kor = scanner.nextInt();
        System.out.print("영어 점수를 입력해주세요 : ");
        eng = scanner.nextInt();
        System.out.print("수학 점수를 입력해주세요 : ");
        mat = scanner.nextInt();

        return new SungJukVO(name,kor,eng,mat,0,0,' ');
    }//readSungJuk

    public void computeSungJuk(SungJukVO sj){
        sj.setSum(sj.getKor() + sj.getEng() + sj.getMat());
        sj.setMean((double)sj.getSum()/3);

        switch ((int)sj.getMean()/10){
            case 10 :
            case 9 : sj.setGrd('수'); break;
            case 8 : sj.setGrd('우'); break;
            case 7 : sj.setGrd('미'); break;
            case 6 : sj.setGrd('양'); break;
            default: sj.setGrd('가');
        }//switch
    }//computeSungJuk
    /**
     * 입력한 이름, 국어, 영어, 수합점수와
     * 계산된 총점, 평균, 학점등을 출력하는 메서드
     */
    public void printSungJuk(SungJukVO sj){
        String fmt = "이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n총합 : %d\n평균 : %.1f\n학점 : %c\n";
        String result = String.format(fmt,sj.getName(),sj.getKor(),sj.getEng(),sj.getMat(),
                                sj.getSum(),sj.getMean(),sj.getGrd());
        System.out.println(result);
    }
}
