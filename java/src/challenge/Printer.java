package challenge;

public class Printer {
    int numOfPapers = 0;

    public Printer() {
    }

    void print(int amount) {
        if (numOfPapers <= 0) System.out.println("용지가 없습니다.");
        else {
            if (numOfPapers < amount) {
                System.out.println("모두 출력하려면 용지가 " + ((numOfPapers - amount) * (-1)) + "매 부족합니다. " + numOfPapers + "장만 출력합니다.");
                numOfPapers = 0;
            } else {
                numOfPapers = numOfPapers - amount;
                System.out.println(amount + "장 출력했습니다. 현재 " + numOfPapers + "장 남아 있습니다.");
            }
        }
    }
}