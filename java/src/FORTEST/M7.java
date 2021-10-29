package FORTEST;

class Person {
    int com = 1;
    String name = "홍길동";
    void whoami() {
        System.out.println("사람");
    }
    static void like() {
        System.out.println("eat");
    }
}

class Student1 extends Person {
    String name = "진";
    void move() {
        System.out.println("walk");
    }
    void whoami() {
        System.out.println("학생");
    }
    static void like() {
        System.out.println("study");
    }
}

class Teacher extends Person {
    String name = "김성훈";
    void move() {
        System.out.println("car");
    }
    void whoami() {
        System.out.println("선생님");
    }
    static void like() {
        System.out.println("teach");
    }
}

class Ex1 {
    public static void main(String[] args) {
        Person p2 = new Teacher();
        System.out.println(p2.com);
        System.out.println(p2.name);
        p2.whoami();
        p2.like();
    }
}
