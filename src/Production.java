public class Production {
    String name;
    String addr;
    String making;

    public Production() {
        name = "이름";
        addr = "주소";
        making = "만든 영화가 1개 이상";
    }

    public Production(String name, String addr, String making) {
        this.name = name;
        this.addr = addr;
        this.making = making;
    }
}
