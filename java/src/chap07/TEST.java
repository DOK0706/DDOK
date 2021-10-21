package chap07;

// 웨어러블 인터페이스
interface Wearable {
    void putOn();   // 입기

    void putOff();  // 벗기
}

// 색칠 인터페이스
interface Colorable {
    int RED = 1;    // 빨강
    int GREEN = 2;  // 초록
    int BLUE = 3;   // 파랑

    void change(int color); // 색변경
}

abstract class WearableRobot implements Wearable, Colorable {
    private int color;  // 색

    WearableRobot(int color) {
        changeColor(color);
    }

    public void changeColor(int color) {
        this.color = color;
    }

    public String toString() {
        switch (color) {
            case RED:
                return "빨강 로봇";
            case GREEN:
                return "초록 로봇";
            case BLUE:
                return "파랑 로봇";
        }
        return "로봇";
    }

    public void putOn() {
        System.out.println(toString() + " 착용!!");
    }

    public void putOff() {
        System.out.println(toString() + " 해제!!");
    }
}

