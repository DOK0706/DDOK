package challenge;

class GolfClub {
    int a;
    String b;
    public GolfClub() {
        a=7;
    }
    public GolfClub(int x) {
        a =x;
    }
    public GolfClub(String y) {
        b = y;
    }
    void print() {
        if (a==0) {
            System.out.println(b + "입니다.");
        }
        else System.out.println(a + "번 아이언입니다.");
    }
}
public class GolfClubTest {
    public static void main(String[] args) {
        GolfClub g1 = new GolfClub();
        g1.print();

        GolfClub g2 = new GolfClub(8);
        g2.print();

        GolfClub g3 = new GolfClub("퍼터");
        g3.print();
    }
}
