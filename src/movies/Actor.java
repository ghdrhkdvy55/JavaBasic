package movies;

public class Actor {
    private String name;
    private String birth;
    private String[] joinmovie;
    private String casting;

    public Actor() {
    }

    public Actor(String name, String birth, String[] joinmovie, String casting) {
        this.name = name;
        this.birth = birth;
        this.joinmovie = joinmovie;
        this.casting = casting;
    }
    // setter/getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String[] getJoinmovie() {
        return joinmovie;
    }

    public void setJoinmovie(String[] joinmovie) {
        this.joinmovie = joinmovie;
    }

    public String getCasting() {
        return casting;
    }

    public void setCasting(String casting) {
        this.casting = casting;
    }
}
