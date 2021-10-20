package P14;

import javafx.scene.control.Skin;

// 스킨 변경 Skinnable 인터페이스
public interface Skinnable {
    int BLACK = 0;    // 검정
    int RED = 1;      // 빨강
    int GREEN = 2;    // 초록
    int BLUE = 3;     // 파랑
    int YELLOW = 4;   // 노랑

    void changeSkin(int skin);  // 스킨변경
}

// 색상 변경이 가능한 소프트웨어 SkinnableSoftWare 클래스
class SkinnableSoftware implements Skinnable {
    int skin;       // 스킨

    // 생성자
    public SkinnableSoftware() {
        this.skin = BLACK;
    }

    public SkinnableSoftware(int skin) {
        this.skin = skin;
    }

    public void changeSkin(int skin) {
        this.skin = skin;
    }      // 스킨 변경

    public int getSkin() {
        return skin;
    }                     // 스킨 가져오기

    public String getSkinString() {                         // 스킨의 문자열 변환
        switch (skin) {
            case BLACK:
                return "BLACK";
            case RED:
                return "RED";
            case GREEN:
                return "GREEN";
            case BLUE:
                return "BLUE";
            case YELLOW:
                return "YELLOW";
        }
        return "";
    }
}

class SkinnableSoftwareTester {
    public static void main(String[] args) {
        SkinnableSoftware x = new SkinnableSoftware();                  // 검정
        SkinnableSoftware y = new SkinnableSoftware(Skinnable.GREEN);   // 초록

        x.changeSkin(Skinnable.YELLOW); // x의 스킨을 노랑으로 변경

        System.out.println("x의 스킨은 " + x.getSkinString() + "입니다.");
        System.out.println("y의 스킨은 " + y.getSkinString() + "입니다.");
    }
}