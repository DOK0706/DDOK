package chap04;

public class HumanDemo {
    public static void main(String[] args) {
        Human kim = new Human();

        kim.name = "김도균";
        kim.height = "180.0";

        kim.singing();

        Human byun = new Human();

        byun.name = "변찬우";
        byun.height = "160.0";

        byun.singing();
        byun.dancing();
    }
}
