package chap10;

public class ExceptionTest {

    public void call(int j) throws ArrayIndexOutOfBoundsException {
        int [] i = {1, 2, 3};
        System.out.println("call value: "+i[j]);
    }
    public static void main(String[] args) {
        ExceptionTest er = new ExceptionTest();
        try {
            er.call(4);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 크기에 맞는 값을 입력하세요!");
        }finally {
            System.out.println("해당 문장은 무조건 수행");
        }
    }
}
