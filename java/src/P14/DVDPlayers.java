package P14;

import javax.swing.*;

// 플레이어 인터페이스 Players
interface Players {
    void play();    // 재생
    void stop();    // 정지
}

// 확장 플레이어 인터페이스 (느린 재생 기능 추가) Explayer
interface Explayer extends Players {
    void slow();    // 느린 재생
}

class DVDPlayer implements Explayer{
    public void play() {        // 재생
        System.out.println("DVD 재생 시작!");
    }
    public void stop() {        // 정지
        System.out.println("DVD 재생 종료!");
    }
    public void slow() {        // 느린 재생
        System.out.println("DVD 느린 재생 시작!");
    }
}

// DVD 플레이어 클래스 사용 예
class DVDplayerTester {
    public static void main(String[] args) {
        DVDPlayer a = new DVDPlayer();
        Players b = new DVDPlayer();
        Explayer c = new DVDPlayer();

        System.out.println("[DVDPlayer형 변수 a]");
        a.play();   // 재생
        a.stop();   // 정지
        a.slow();   // 느린 재생

        System.out.println("[Player형 변수 b]");
        b.play();   // 재생
        b.stop();   // 정지

        System.out.println("[ExPlayer형 변수 c]");
        c.play();   // 재생
        c.stop();   // 정지
        c.slow();   // 느린 재생
    }
}
