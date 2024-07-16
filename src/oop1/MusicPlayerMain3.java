package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);

        volumeUp(data);
        volumeUp(data);
        volumeDown(data);

        showStatus(data);

        off(data);
    }
    // 1. 음악 플레이어 켜기 메서드
    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    // 2. 음악 플레이어 끄기 메서드
    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    // 3. 볼륨 증가 메서드
    static void volumeUp(MusicPlayerData data){
        data.volume ++;
        System.out.println("음악 플레이어 볼륨: "  +data.volume);
    }
    // 4. 볼륨 감소 메서드
    static void volumeDown(MusicPlayerData data){
        data.volume --;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }
    // 5. 상태확인 메서드
    static void showStatus(MusicPlayerData data){
        if(data.isOn){
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        }else{
            System.out.println("음악 플레이어 OFF");
        }
    }
}