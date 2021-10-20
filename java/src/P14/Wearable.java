package P14;

// 웨어러블 인터페이스 Wearable
public interface Wearable {
    void putOn();   // 입기

    void putOff();  // 벗기
}

// 헤드폰 클래스 Headphone
class Headphone implements Wearable {
    int volume = 0; // 볼륨

    public void putOn() {
        System.out.println("헤드폰을 착용했습니다.");
    }

    public void putOff() {
        System.out.println("헤드폰을 벗었습니다.");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("볼륨을 " + volume + "로 변경했습니다.");
    }
}

// 웨어러블 컴퓨터 클래스 WearableComputer
class WearableComputer implements Wearable {
    public void putOn() {
        System.out.println("컴퓨터를 실행했습니다.");
    }

    public void putOff() {
        System.out.println("컴퓨터를 껐습니다.");
    }

    public void reset() {
        System.out.println("컴퓨터를 재시작했습니다.");
    }
}

// 인터페이스 Wearable을 구현한 클래스의 사용 예
class WearableTester {
    public static void main(String[] args) {
        Wearable[] a = new Wearable[2];
        a[0] = new Headphone();              // 헤드폰
        a[1] = new WearableComputer();       // 웨어러블 컴퓨터

        for (int i = 0; i < a.length; i++)
            a[i].putOn();
        for (int i = 0; i < a.length; i++)
            a[i].putOff();
    }
}
