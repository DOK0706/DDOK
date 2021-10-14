package challenge;

public class BestGirl extends GoodGirl {
    BestGirl(String name) {
        super(name);
        this.name=name;
    }

    void show(){
        System.out.println(name+"는 자바를 무지하게 잘 안다.");
    }
}
