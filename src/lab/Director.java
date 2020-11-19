package lab;

public class Director {
    String name;
    String birth;
    int direct;
    String dirappear;


    public Director() {
        name = "이름";
        birth = "생년월일";
        direct = 3;
        dirappear = "감독한 영화에 출현";
    }

    public Director(String name, String birth, int direct, String dirappear) {
        this.name = name;
        this.birth = birth;
        this.direct = direct;
        this.dirappear = dirappear;
    }
}
