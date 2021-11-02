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
        Student1 s =new Student1();
        Person p = new Person();

        System.out.println(p instanceof Student1);
        System.out.println(s instanceof Person);
        System.out.println(s instanceof Object);
        System.out.println(s instanceof Student1);
        p=s;
        System.out.println(p instanceof Student1);
    }
}
