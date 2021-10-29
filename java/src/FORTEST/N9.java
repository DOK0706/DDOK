package FORTEST;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    Student() {

        this("no name");
        System.out.println("no argument");
    }
}
