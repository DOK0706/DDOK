package Chap06;

import java.rmi.StubNotFoundException;

public class Studenttest {
    public static void main(String[] args) {
        Student stdIn = new Student("김도균", 123456, 1201);
        stdIn.print();
        Student stdIn1 = new Student("김민준", 123456, 1202);
        stdIn1.print();
        stdIn.fall();
    }
}
