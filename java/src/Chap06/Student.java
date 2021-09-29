package Chap06;

public class Student extends People{
    int hakbun;

    public Student(String name, int ssn, int hakbun) {
        super(name, ssn);
        this.hakbun=hakbun;
    }
    void print() {
        System.out.println("이름: " + name + "\n학번: " + hakbun + "\nssn:" + ssn);
    }

    void fall() {
        System.out.println("나는 사람이면서 학생입니다.");
    }
}
