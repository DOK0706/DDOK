package Chap06;

class Person{
    public int age;
    public long height;
    public float weight;
}

public class PersonTestMain {
    public static void main(String[] args) {
        Person brother = new Person();
        brother.age = 17;
        brother.height = 170;
        brother.weight = 50;
        System.out.println("age : " + brother.age + "height : " + brother.height + "weight : " + brother.weight);
    }
}
