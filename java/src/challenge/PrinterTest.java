package challenge;

public class PrinterTest {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.numOfPapers=10;
        p.print(2);
        p.print(20);
        p.print(10);
    }
}