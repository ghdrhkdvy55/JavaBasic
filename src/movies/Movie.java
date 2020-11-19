package movies;

public class Movie {
    private String title;
    private String year;
    private String runtime;
    private String prdtin;
    private String [] genre;
    private String [] dirtor;
    private String [] actor;
    private String summary;
    private String desc;

    //생성자
    public Movie(){
    }


    //
    public Movie(String title, String year, String runtime, String prdtin, String[] genre, String[] dirtor, String[] actor, String summary, String desc) {
        this.title = title;
        this.year = year;
        this.runtime = runtime;
        this.prdtin = prdtin;
        this.genre = genre;
        this.dirtor = dirtor;
        this.actor = actor;
        this.summary = summary;
        this.desc = desc;
    }
    // setter/getter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getPrdtin() {
        return prdtin;
    }

    public void setPrdtin(String prdtin) {
        this.prdtin = prdtin;
    }

    public String[] getGenre() {
        return genre;
    }

    public void setGenre(String[] genre) {
        this.genre = genre;
    }

    public String[] getDirtor() {
        return dirtor;
    }

    public void setDirtor(String[] dirtor) {
        this.dirtor = dirtor;
    }

    public String[] getActor() {
        return actor;
    }

    public void setActor(String[] actor) {
        this.actor = actor;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}


