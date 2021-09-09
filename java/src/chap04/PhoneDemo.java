package chap04;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone galaxy = new Phone();

        galaxy.value = 100;
        galaxy.model = "갤럭시S8";

        galaxy.print();
        Phone apple = new Phone();

        apple.value = 200;
        apple.model = "아이폰10";

        apple.print();
    }
}

