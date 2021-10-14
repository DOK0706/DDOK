package Chap06;

class SportsCar extends Car1 {
    void whoami() {
        System.out.println("나는 스포츠카다.");
    }
}

public class PolymoDemo {
    public static void main(String[] args) {
        Vehicle1[] v = new Vehicle1[2];
        v[0] = new Car1();
        v[1] = new SportsCar();

        for(Vehicle1 i:v) {
            i.whoami();
        }
    }
}
