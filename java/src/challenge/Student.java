package challenge;

public class Student extends Person{
    int num;
    Student(String name, int age, int num) {
        super(name, age);
        this.num = num;
    }
    void show(){
        System.out.println("사람"+"[이름: "+name+", 나이: "+age+", 학번:"+num+"]");
    }
}
