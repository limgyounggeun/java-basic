package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 켜기
        on(data);
        System.out.println("음악 플레이어를 시작합니다");

        //볼륨 증가
        volumeUp(data);
        //볼륨 증가
        volumeUp(data);
        //볼륨 감소
        volumeDown(data);
        //음악 플레이어 상태 확인
        showStatus(data);
        //음악 플레이어 종료
        off(data);
    }
    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어 On");
    }
    static void off(MusicPlayerData data){
        System.out.println("음악 플레이어 Off");
    }
    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("음악 플레이어 볼륨"+data.volume);
    }
    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("음악 플레이어 볼륨"+data.volume);
    }
    static void showStatus(MusicPlayerData data){
        System.out.println("음악 플레이어 상태를 확인 합니다.");
        if(data.isOn){
            System.out.println("음악 플레이어 On, 볼륨 :" +data.volume);
        }else {
            System.out.println("음악 플레이어 Off");
        }
    }
}
