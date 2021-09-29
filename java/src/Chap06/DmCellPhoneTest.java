package Chap06;

public class DmCellPhoneTest {
    public static void main(String[] args) {
        DmCellPhone dm = new DmCellPhone("자바폰", "검정", 10);

        System.out.println(dm.model);
        System.out.println(dm.color);
        System.out.println(dm.channel);

        dm.powerON();
        dm.bell();
        dm.sendVoice("모시모시데스네 다이죠부데스까");
        dm.reciveVoice("시츠레데스가 와티시와 나마에 김도균데스");
        dm.sendVoice("소 데스까~ 하지메마시떼");
        dm.hangUp();

        dm.turnOnDmb();
        dm.changeChannel(12);
        dm.turnOffDmb();

    }
}
