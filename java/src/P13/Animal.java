package P13;

//--- 동물 클래스 (Ver.1) ---//

abstract class Animal {
    private String name;        // 이름
    public Animal(String name) {this.name=name;}     // 생성자
    public abstract  void bark();                   // 찾기
    public String getName() {return name;}          // 이름 확인
}

//--- 개 클래스 (Ver.1) ---//
class Dog extends Animal {
    private String type;        // 개의 종류
    public Dog(String name, String type) {          // 생성자
        super(name); this.type=type;
    }
    public void bark() {
        System.out.println("멍멍!");                 // 찾기
    }
}

//--- 고양이 클래스 ---//
class Cat extends Animal {
    private int age;        // 나이
    public Cat(String name, int age) {               // 생성자
        super(name); this.age=age;
    }
    public void bark() {
        System.out.println("냐옹!");                  // 짖기
    }
}

