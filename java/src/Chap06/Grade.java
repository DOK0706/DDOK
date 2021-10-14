package Chap06;

class Grade {
    int Math;
    int Kor;
    int Eng;

    public Grade(int Math, int Kor, int Eng) {
        this.Math = Math;
        this.Kor = Kor;
        this.Eng = Eng;
    }

    public int sum() {
        return Math + Kor + Eng;
    }

    public double avg() {
        return (Math + Kor + Eng) / 3.0;
    }

}

class GradeTest {
    public static void main(String[] args) {
        Grade g = new Grade(21, 11,44);
        System.out.println(g.sum());
        System.out.println(g.avg());
    }
}
