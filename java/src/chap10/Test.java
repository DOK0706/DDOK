package chap10;
class MadPlay<T> {
    private T vale;     // 멤버 변수 vale의 타입은 T이다.

    public  T getVal() {
        // T 타입의 값 vale을 반환한다.
        return vale;
    }

    public void setVal(T vale) {
        // T 타입의 값을 멤버 변수 vale에 대입한다.
        this.vale = vale;
    }
}

public class Test {
    public static void main(String[] args) {
        MadPlay<String> mp = new MadPlay<String>();
    }
}
