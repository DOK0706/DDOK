package challenge;

public class GoodGirl extends Girl {
    GoodGirl(String name) {
        super(name);
        this.name = name;
    }

    void show() {
        System.out.println(this.name+"는 자바를 잘 안다");
    }
}
