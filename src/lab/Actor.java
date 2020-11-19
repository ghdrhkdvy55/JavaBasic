package lab;

public class Actor {
    String name;
    String birth;
    String appear;
    String cast;

    public Actor(){
        name = "이름";
        birth = "생년월일";
        appear = "출현한 영화가 1개 이상";
        cast = "배역";
    }

    public Actor(String name, String birth, String appear, String cast){
        this.name = name;
        this.birth = birth;
        this.appear = appear;
        this.cast = cast;
    }
}
