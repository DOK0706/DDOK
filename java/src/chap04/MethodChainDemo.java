/*package chap04;
//연속 호출
class Person {
    String name;
    int age;

    public Chap06.Person SetName(String name) {
        this.name = name;
        return this;
    }

    public Chap06.Person SetAge(int age) {
        this.age = age;
        return this;
    }

    public void sayHello() {
        System.out.println("안녕! 나는 " + name + "이고, 나이는 " + age + "살이야.");
    }
}

public class MethodChainDemo {
    public static void main(String[] args) {
        Chap06.Person p = new Chap06.Person();

//        p.SetName("김도균");
//        p.SetAge(17);
//        p.sayHello();

        p.SetName("김도균").SetAge(17).sayHello();
    }
}
*/