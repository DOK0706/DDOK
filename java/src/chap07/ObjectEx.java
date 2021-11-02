package chap07;

class Home {
    static int i;
    String locate;
    Home() {
        i++;
    }
    Home(String locate) {
        this.locate = locate;
    }
}
class School extends Home{
    String name;
    public School(String name) {
        this.name = name;
    }
    School(String locate, String name) {
        super(locate);
        this.name = name;
    }
    public School() {

    }
    public String toString() {
        return "김도균";
    }
    int add(int a, int b) {
        return a+b;
    }
    double add(double a, double b) {
        return a+b;
    }

    double add(double a, double b, int c) {
        return a+b+c;
    }
    static int width = 100;
    static int height = 200;
    static int wide() {
        return width*height;
    }
}
public class ObjectEx {
    public static void main(String[] args) {
        School s = new School();
        School s1 = new School("광주");
        School s2 = new School("부산");
        School s3 = new School("광산구", "광주");
        System.out.println(Home.i);

//        System.out.println(s3.locate + " " + s3.name +"소프트웨어마이스터고");
//        System.out.println(s1.name + "소프트웨어마이스터고");
//        System.out.println(s2.name + "소프트웨어마이스터고");
//        System.out.println("와타시 나마에와 " + s.toString());
//        System.out.println(s.add(1, 2));
//        System.out.println(s.add(1.0, 2.2));
//        System.out.println(s.add(1.1, 2.2, 3));
//        System.out.println(School.width);
//        System.out.println(School.height);
//        System.out.println(School.wide());

    }
}