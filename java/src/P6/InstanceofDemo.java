package P6;

public class InstanceofDemo {
    public static void main(String[] args) {
        Stud s = new Stud();
        Person p = new Person();

        System.out.println(s instanceof Person);
        System.out.println(p instanceof Person);
        System.out.println(s instanceof Stud);
        System.out.println(p instanceof Stud);
    }
}
