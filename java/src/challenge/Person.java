package challenge;

public class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name=name;
        this.age=age;
    }
    void show(){
        System.out.println("사람"+"[이름: "+name+", 나이:"+age+"]");
    }
}
