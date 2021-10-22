package P14;

// 헤드마운트 디스플레이 클래스
public class HeadMountedDisplay implements Wearable, Skinnable {
    private int skin;   // 스킨

    // 착용
    public void putOn() {
        System.out.println("디스플레이를 착용했습니다.");
    }

    // 해제
    public void putOff() {
        System.out.println("디스플레이를 벗었습니다.");
    }

    // 스킨 변경
    public void changeSkin(int skin) {
        this.skin = skin;
    }

    // 현재 스킨 표시
    public void putSkin() {
        switch (skin) {
            case BLACK:
                System.out.println("BLACK DISPLAY");
                break;
            case RED:
                System.out.println("RED DISPLAY");
                break;
            case GREEN:
                System.out.println("GREEN DISPLAY");
                break;
            case BLUE:
                System.out.println("BLUE DISPLAY");
                break;
            case YELLOW:
                System.out.println("YELLOW DISPLAY");
                break;
        }
    }
}

// 헤드마운트 디스플레이 클래스 사용 예
class HeadMountedDisplayTester {
    public static void main(String[] args) {
        HeadMountedDisplay hmd = new HeadMountedDisplay();
        hmd.putOn();    // 착용
        hmd.putOff();   // 해제
        hmd.changeSkin(Skinnable.YELLOW);   // 스킨 변경
        hmd.putSkin();  // 스킨 표시

        Wearable w = hmd;
        w.putOn();      // 착용
        w.putOff();     // 해제

        Skinnable s = hmd;
        s.changeSkin(Skinnable.BLACK);      // 스킨 변경

        hmd.putSkin();  // 스킨 표시
    }
}