package oop1;

public class MusicPlayerData {
    int volume = 0;
    boolean isOn = false;

    void on(){
        isOn = true; //자신의 멤버변수
        System.out.println("음악 플레이어를 시작합니다.");
    }
    void off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    void volumeUp(){
        volume ++; //자신의 멤버변수 volume -> 1
        System.out.println("음악 플레이어 볼륨: " + volume);
    }
    void volumeDown(){
        volume --; //여기서 멤버변수는 자신의 멤버변수
        System.out.println("음악 플레이어 볼륨: " + volume);
    }
    void showStatus(){
        System.out.println("음악 플레이어 상태 확인");
        if(isOn){
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        }else{
            System.out.println("음악 플레이어 OFF");
        }
    }
}