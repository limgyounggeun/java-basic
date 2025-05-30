package oop1;

public class MusicPlayer {
    int volume = 0 ;
    boolean isOn = false ;

    void on(){
        isOn = true;
        System.out.println("음악 플레이어 On");
    }
    void off(){
        isOn = false;
        System.out.println("음악 플레이어 Off");
    }
    void volumeUp(){
        volume++;
        System.out.println("음악 플레이어 볼륨"+volume);
    }
    void volumeDown(){
        volume--;
        System.out.println("음악 플레이어 볼륨"+volume);
    }
    void showStatus(){
        System.out.println("음악 플레이어 상태를 확인 합니다.");
        if(isOn){
            System.out.println("음악 플레이어 On, 볼륨 :" + volume);
        }else {
            System.out.println("음악 플레이어 Off");
        }
    }
}
