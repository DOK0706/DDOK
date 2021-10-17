package test;

public class BaseBall extends Sports {
    int player;
    String name;

    void rule(String name, int player) {
        System.out.println("경기종목: " + name);
        System.out.println("플레이어: " + player);
    }

}
