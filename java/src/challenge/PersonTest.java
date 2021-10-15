package challenge;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("길동이", 22);
        Student s = new Student("황진이", 23,100);
        ForeignStudent f = new ForeignStudent("Amy", 30, 200, "U.S.A");
        p.show();
        s.show();
        f.show();
    }
}
