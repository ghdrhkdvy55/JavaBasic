package 홍광표;

/**
 * 파일명 : SungJukV1
 * 작성일 : 2020.11.17
 *
 * 프로그램 설명: 성적처리프로그램 v1
 * 이름,국어점수,영어점수,수학점수를 설정하면
 * 총점,평균,학점을 계산하고 결과 출력
 * 학점기준은 '수우미양가'로 함
 * 만점은 100점으로
 * 100~90, 89~80, 79~70, 69~60, 59~0
 * name, kor, eng, mat, sum, mean, grd
 */
public class SungJukV1 {
    public static void main(String[] args) {
        String name = "혜교";
        int kor = 0, eng = 0, mat = 0, sum, mean;
        char grd;
        sum = kor+eng+mat;
        mean = sum/3;
        System.out.println("이름 : " + name);
        System.out.println("국어 : " + kor);
        System.out.println("영어 : " + eng);
        System.out.println("수학 : " + mat);

        if(mean >89){
            System.out.println("학점은 '수' 입니다");
            grd = '수';
        }else if(mean>79){
            System.out.println("학점은 '우' 입니다");
            grd = '우';
        }else if(mean>69){
            System.out.println("학점은 '미' 입니다");
            grd = '미';
        }else if(mean>59){
            System.out.println("학점은 '양' 입니다");
            grd = '양';
        }else{
            System.out.println("학점은 '가' 입니다");
            grd = '가';
        }


    }
}
