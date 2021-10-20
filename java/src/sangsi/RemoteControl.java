package sangsi;

public interface RemoteControl {
    // 상수
    public int MAX_VOLUME=10;
    public int MIN_VOLUME=0;

    // 추상 메서드
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);

    // 디폴트 메서드
    default void setMute(boolean mute) {
        if(mute) {
            System.out.println("무음 처리합니다.");
        }
        else
            System.out.println("무음을 해제합니다");
    }

    // 정적 메서드
    static void changeBattery() {
        System.out.println("배터리를 교환합니다.");
    }
}

abstract class Tv implements RemoteControl{
    private int volume;

    public void turnon() {
        System.out.println("Tv를 켭니다.");
    }

    public void TurnOff() {
        System.out.println("Tv를 끕니다다");
   }

   public void setVolume(int volume) {
        if(volume > MAX_VOLUME)
            this.volume=volume;
        else if (volume<MIN_VOLUME)
            this.volume = MIN_VOLUME;
        else
            this.volume=volume;

   }
}

abstract class Audio implements RemoteControl{
    private int volume;

    public void turnon() {
        System.out.println("Audio를 켭니다.");
    }

    public void TurnOff() {
        System.out.println("Audio를 끕니다다");
    }

    public void setVolume(int volume) {
        if(volume > MAX_VOLUME)
            this.volume=volume;
        else if (volume<MIN_VOLUME)
            this.volume = MIN_VOLUME;
        else
            this.volume=volume;

        System.out.println("현재 Audio는 "+volume+"입니다.");
    }

    public static void main(String[] args) {
    }
}
