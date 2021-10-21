package chap07;

import test.Pen;

interface Dinosaur { public abstract void cry();}
class T_Rax implements Dinosaur {
    public void cry() {
        System.out.println("꾸어어엉");
    }
    void walk() {
        System.out.println("걷기");
    }
}
class Ptera implements Dinosaur {
    void fly() {
        System.out.println("날기");
    }

    @Override
    public void cry() {
        System.out.println("끼에에엑");
    }
}
class Tester {
    public static void main(String[] args) {
        Dinosaur[] d = {new T_Rax(), new Ptera()};

        d[0].cry();
        ((T_Rax) d[0]).walk();

        d[1].cry();
        ((Ptera) d[1]).fly();
    }
}