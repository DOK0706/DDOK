package test;

class Product {
    int code;
    int count = 5;

    void add() {
        count = count + 1;
    }

    void sub() {
        count = count - 1;
    }

    void show() {
        System.out.println("현재 재고는 " + count + "입니다.");
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Product p = new Product();
        p.show();
        p.add();
        p.show();
        p.sub();
        p.show();
    }
}
