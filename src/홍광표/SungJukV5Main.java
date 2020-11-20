package 홍광표;
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
 *
 * 단, 성적처리 결과를 출력시 출력문을 하나만사용하기로 함
 * 그리고, Math.round()를 이용해서 평균은 소수점 둘째자리까지 끊어서 출력
 */
public class SungJukV5Main {
    public static void main(String[] args) {

        SungJukService sjsrv = new SungJukService();

        SungJukVO sj = sjsrv.readSungJuk();

        //System.out.println(sj.getName());
        // 변수의 유효범위scope
        // 변수가 생성된 위치와 사용하는 위치가 다른경우
        // 그결과가 예상과 다를 수 있음
        // 변수의 유효범위는 블록이라고 하고{}로 표현
        // 기본자료형 변수 : call by value
        // 참조자료형 변수 : call by reference
        sjsrv.computeSungJuk(sj);

        sjsrv.printSungJuk(sj);
    }
}
