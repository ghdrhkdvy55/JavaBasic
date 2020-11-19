package movies;

public class MovieMain {
    public static void main(String[] args) {
        String[] genre = {"액션","SF"};
        String[] dirtor = {"안소니 루소","조 루소"};
        String[] actor = {"로버트 다우니", "크리스 햄스워스", "스칼렛 요한슨"};
        String summary = "인피니티 워 이후 절반만 살아남은 지구 마지막 희망이 된 어벤져스 먼저 떠난 그들을 위해 모든 것을 걸었다! 위대한 어벤져스 운명을 바꿀 최후의 전쟁이 펼쳐진다!";
        String desc = "재미있다";

        Movie Avengers = new Movie("어벤져스", "2019.04.24.", "181",
                            "월트 디즈니 컴퍼니 코리아", genre,dirtor,actor,summary,desc);

        System.out.println(Avengers.getTitle());
        System.out.println(Avengers.getYear());
        System.out.println(Avengers.getRuntime());
        System.out.println(Avengers.getPrdtin());
        System.out.println(Avengers.getGenre());
        for(int i = 0; i < genre.length; i++) {
            System.out.println(Avengers.getGenre()[i]);
        }
        for(int i = 0; i < dirtor.length; i++) {
            System.out.println(Avengers.getDirtor()[i]);
        }
        for(int i = 0; i < actor.length; i++) {
            System.out.println(Avengers.getActor()[i]);
        }
        System.out.println(Avengers.getSummary());
        System.out.println(Avengers.getDesc());
    }
}
