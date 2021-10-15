package challenge;

public class ForeignStudent extends Student{
    String From;
    ForeignStudent(String name, int age, int num, String From) {
        super(name, age, num);
        this.From=From;
    }
    void show(){
        System.out.println("사람"+"[이름: "+name+", 나이: "+age+", 학번:"+num+", 국적: "+From+"]");
    }
}
